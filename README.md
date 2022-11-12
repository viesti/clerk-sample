# Datan visualisointi työpaja käyttäen [Clerk](https://github.com/nextjournal/clerk) notebookia Clojurella

[Clerk](https://github.com/nextjournal/clerk) on Clojurelle tehty notebook työkalu jolla "luodaan Clojure nimiavaruudesta notebook":

<img width="856" alt="image" src="https://user-images.githubusercontent.com/57011/201387085-b6387103-79dd-4987-957d-046cea496f5c.png">

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
