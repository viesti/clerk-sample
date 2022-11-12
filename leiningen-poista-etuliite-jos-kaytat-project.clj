(defproject cleck-sample "0.0.1"
  :dependencies [;; Clerk kirjasto, jolla notebookkeja voidaan tehdä
                 [io.github.nextjournal/clerk "0.11.603"]

                 ;; HTTP kyselyjen tekoon (esim. data haku rajapinnoista)
                 [clj-http/clj-http "3.12.3"]

                 ;; JSON merkijonojen parsintaan Clojure tietorakenteiksi
                 [metosin/jsonista "0.3.6"]

                 ;; Tiedostojen käsittelyyn, voidaan käyttää esim. kotus zip tiedoston purkamiseen
                 [babashka/fs "0.1.11"]]

  :source-paths ["notebooks" "dev"])
