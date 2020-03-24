# Vaatimusmäärittely

## Sovelluksen tarkoitus

Sovellus on Pong-tyylinen peli, jossa pelaajat yrittävät mailaa ohjaamalla saada pallon vastustajansa maalirajan taakse, ja samalla estää palloa ylittämästä omaa maalirajaansa. Perinteisestä Pongista poiketen maila voi liikkua myös vaaka-akselilla, ja sitä ohjataan hiiren tai muun osoitinlaitteen avulla.

Sovelluksen tarkoitus on viihdyttää.


## Pelin säännöt

 - Pelin alussa pallo alkaa satunnaisesti valitun pelaajan alueella liikkumattomana. Jos pelaaja ei lyö palloa 10 sekunnin kuluessa, ottelu peruuntuu.
 - Pallon ylittäessä pelaajan maalirajan, vastakkainen pelaaja saa pisteen.
 - Pallon on ylitettävä keskiraja, jotta sitä voidaan lyödä uudelleen.
 - Pisteen jälkeen pallo alkaa pisteen saaneen pelaajan alueella liikkumattomana. Jos pelaaja ei lyö palloa 5 sekunnin kuluessa, vastustajalle tuomitaan piste.
 - Pelaaja voittaa, jos hänellä on kaikkiaan viisi pistettä tai enemmän, ja kahden tai useamman pisteen johtoasema.


## Perusversion toiminnallisuus

 - Käyttäjä voi pelata tietokonetta vastaan.
	- Käyttäjä voi valita helpon tai vaikean tietokonevastustajan.
 - Käyttäjän tulokset tallennetaan, ja niitä voi tarkastella jälkeenpäin.


## Käyttöliittymä

Perusversiossa eri toimintojen käyttö aloitetaan käynnistämällä ohjelma komentorivistä eri argumentein. Aputoiminto selostaa ohjelman käytön.


## Jatkokehitysideoita

 - Graafinen valikko.
 - Moninpeli verkon välityksellä
	- Otteluhistoriaan perustuva ranking-luku (paikallisesti säilytetty -- herkkä pelaaja saa tahtoessaan muokata)
	- Nelinpeli (epätodennäköinen)
	- Lobby-palvelin tai botti, joka välittää haasteita ja pitää kirjaa tuloksista ja rankingeista (epätodennäköinen)
 - Replay-järjestelmä, jolla voi toistaa kokonaisia otteluita tallennetun pelitapahtumalokin pohjalta (erittäin epätodennäköinen)
