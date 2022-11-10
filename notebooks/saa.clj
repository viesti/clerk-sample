^{:nextjournal.clerk/visibility #{:hide-ns}}
(ns saa
  (:require [clj-http.client :as http]
            [jsonista.core :as json]
            [nextjournal.clerk :as clerk]))

;; Piirretään säädataa

;; Ensin haetaan paikkakunnan koordinaatit

(def espoo (-> (http/get "https://geocoding-api.open-meteo.com/v1/search"
                         {:query-params {"name" "Espoo"}})
               :body
               (json/read-value json/keyword-keys-object-mapper)
               :results
               first
               (select-keys [:latitude :longitude])))


;; Sitten haetaan ennuste

(def weather (-> (http/get "https://api.open-meteo.com/v1/forecast"
                           {:query-params {"hourly" "temperature_2m"
                                           "latitude" (:latitude espoo)
                                           "longitude" (:longitude espoo)}})
                 :body
                 (json/read-value json/keyword-keys-object-mapper)
                 :hourly))


;; Sitten piiretään ennuste

;; Ensin muunnetaan dataa hieman


(def data (map (fn [temp time]
                 {:temp temp
                  :time time})
               (:temperature_2m weather)
               (:time weather)))

;; Sitten tehdään graafi

(clerk/vl {:width 800
           :height 600
           :data {:values data}
           :mark "line"
           :encoding {"x" {:field "time"
                           :type "temporal"}
                      "y" {:field "temp"
                           :type "quantitative"}}})
