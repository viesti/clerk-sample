(ns user
  ;; Ladataan clerk -kirjasto ja laitetaan se käyttöön "clerk" aliaksen taakse
  (:require [nextjournal.clerk :as clerk]))

;; Kommenttiin pari apuria.
;; Kommentin sisältöä ei evaluoida,
;; vaikka koko tiedosto lähetettäisiin Clojure kääntäjälle evaluoitavaksi
(comment
  (clerk/serve! {;; Seurataan notebooks hakemiston tiedostoja
                 :watch-paths ["notebooks"]
                 ;; Avataan selaine kun evaluoidaan tämä funktiokutsu
                 :browse? true
                 ;; Käynnistetään webbiserveri serveri porttiin 6688
                 :port 6688})

  ;; Laitetaan notebook näkyville
  (clerk/show! "notebooks/saa.clj")

  ;; Tällä saa tehtyä notebookista html sivun
  (clerk/build-static-app! {:paths ["notebooks/saa.clj"]})
  )
