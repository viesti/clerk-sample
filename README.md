# [Clerk](https://github.com/nextjournal/clerk) esimerkki

Suositus on käyttää "Jack-in" toimintoa REPL käynnistämiseen, tämän kautta IDEt lataavat työkalut esim. "autocomplete" varten.

VSCodessa "Open Folder" niin projekti tunnistetaan ja Repl yhteys tarjoaa "Jack-in" toimintoa.

Tämän jälkeen avaa "dev/user.clj" tiedosto, evaluoi `(ns user...)` koodinpätkä ja sen jälkeen evaluoi `comment` -lohkon sisällä olevat koodinpätkät. Evaluointi Calvassa tapahtuu viemällä kursori sulkeismuodon loppuun ja painamalla `CTRL + Enter`.

## Lisää tutkittavaa

* Clerk dokumentaatio: https://book.clerk.vision/
* Parturikampaamot Suomessa notebook: https://github.com/jhimanka/parturit
* Clerk demorepo: https://github.com/nextjournal/clerk-demo/
* Linkkejä muihin notebookeihin: https://clerk.vision/
* Nykysuomen sanalista: https://kaino.kotus.fi/sanat/nykysuomi/
  * Voidaan koodata vaikka visualisointi sanoissa esiintyvien kirjainten määrästä
