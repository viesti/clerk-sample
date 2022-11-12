^{:nextjournal.clerk/visibility #{:hide-ns}}
(ns saa
  (:require [clj-http.client :as http]
            [jsonista.core :as json]
            [nextjournal.clerk :as clerk]))

;; # Piirretään säädataa

;; Alla olevat esimerkkikoodit on otettu pois evaluoinnista `#_` komennolla.

;; Ota yksi kerrallaan `#_` komento pois ja katso miltä tulos näyttää Clerkin avaamassa selaimessa.

;; Näin voi ottaa selvää mitä koodi tekee :)

;; Ensin haetaan paikkakunnan koordinaatit

#_(def paikkakunta "Espoo")

#_(def koordinaatit (-> (http/get "https://geocoding-api.open-meteo.com/v1/search"
                                {:query-params {"name" paikkakunta}})
                      :body
                      (json/read-value json/keyword-keys-object-mapper)
                      :results
                      first
                      (select-keys [:latitude :longitude])))


;; Sitten haetaan ennuste

#_(def ennuste (-> (http/get "https://api.open-meteo.com/v1/forecast"
                           {:query-params {"hourly" "temperature_2m"
                                           "latitude" (:latitude koordinaatit)
                                           "longitude" (:longitude koordinaatit)}})
                 :body
                 (json/read-value json/keyword-keys-object-mapper)
                 :hourly))


;; Sitten piiretään ennuste

;; Ensin muunnetaan dataa hieman


#_(def data (map (fn [temp time]
                 {:temp temp
                  :time time})
               (:temperature_2m ennuste)
               (:time ennuste)))

;; Katsotaan aluksi taulukon avulla miltä data näyttää

#_(clerk/table data)

;; Sitten tehdään graafi

#_(clerk/vl {:width 800
           :height 600
           :data {:values data}
           :mark "line"
           :encoding {"x" {:field "time"
                           :type "temporal"}
                      "y" {:field "temp"
                           :type "quantitative"}}})

;; Muuta kokeiltavaa

;; Kuvan saa näkyviin lukemalla se Javan ImageIO kirjaston avulla

#_(javax.imageio.ImageIO/read (java.net.URL. "https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/The_Sower.jpg/1510px-The_Sower.jpg"))
  
