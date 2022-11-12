# Datan visualisointi työpaja käyttäen [Clerk](https://github.com/nextjournal/clerk) notebookia Clojurella

[Clerk](https://github.com/nextjournal/clerk) on Clojurelle tehty notebook työkalu jolla "luodaan Clojure nimiavaruudesta notebook":

<img width="856" alt="image" src="https://user-images.githubusercontent.com/57011/201387085-b6387103-79dd-4987-957d-046cea496f5c.png">

## Mikä on "notebook"

Notebookit ovat eräänlaisia sähköisiä "muistkirjoja". Vähän kuten muistivihko, johon kynällä kirjoitetaan ja piirretään kuvia, kirjoitetaan ja piirretään notebookeihin, mutta käyttäen koodia tuottamaan tekstiä ja kuvia.

Tiedon visualisointia tehdään esimerkiksi mediassa ja tieteellisissä julkaisuissa, mutta notebookeissa erityistä on, että monesti visualisointi tuotetaan koodin avulla.

## Clerk esimerkki tässä repossa

Notebookin käyttö toimii parhaiten siten, että pidetään editorin ikkuna ja selaimen ikkuna vierekkäin, jolloin koodi ja tulos on samaan aikaan näkyvissä.

Suositus on käyttää "Jack-in" toimintoa REPL käynnistämiseen, tämän kautta IDEt lataavat työkalut esim. "autocompletea" varten.

VSCodessa "Open Folder" niin projekti tunnistetaan ja Repl yhteys tarjoaa "Jack-in" toimintoa.

Tämän jälkeen avaa "dev/user.clj" tiedosto, evaluoi `(ns user...)` koodinpätkä ja sen jälkeen evaluoi `comment` -lohkon sisällä olevat koodinpätkät. Evaluointi Calvassa tapahtuu viemällä kursori sulkeismuodon loppuun ja painamalla `CTRL + Enter`.

## Lisää tutkittavaa

* Clerk dokumentaatio: https://book.clerk.vision/
* Parturikampaamot Suomessa notebook: https://github.com/jhimanka/parturit
* Clerk demorepo: https://github.com/nextjournal/clerk-demo/
* Linkkejä muihin notebookeihin: https://clerk.vision/
* Nykysuomen sanalista: https://kaino.kotus.fi/sanat/nykysuomi/
  * Voidaan koodata vaikka visualisointi sanoissa esiintyvien kirjainten määrästä
* https://www.avoindata.fi/fi
  * Täältä löytyy monta datalähdettä, joista voidaan harjoitella datan hakua ja visualisointia
* Vega-Lite
  * Visualisointikirjasto, joka pohjaa datalla tehtyyn kuvaukseen, jonka perusteella JavaScript kirjasto tekee visualisointia
  * Käytössä Clerk -kirjastossa, `clerk/vl` funktiolla
    * Clojure sopii Vega-Lite kanssa hyvin yhteen, sillä data jota Vega-Lite piirtäjä tulkitsee, on mielekästä luoda Clojurella
  * Dokumentaatio löytyy https://vega.github.io/vega-lite/
  * Eräs interaktiivinen esimerkki maalämpöpumpun säätökäyrän visualisoinnista: https://tiuhti-web.s3.amazonaws.com/saatokayra/index.html
    * Tässä esimerkissä käytetty myös kontrolleja (kuvaajan alla "muutos" ja "muutos_raja")
  * Kirjaston luojilta hyvä esitys siitä, mistä Vega-Lite on tullut ja mitä sillä voi tehdä: https://www.youtube.com/watch?v=9uaHRWj04D4
