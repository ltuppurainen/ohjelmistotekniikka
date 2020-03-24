# Vaatimusm��rittely

## Sovelluksen tarkoitus

Sovellus on Pong-tyylinen peli, jossa pelaajat yritt�v�t mailaa ohjaamalla saada pallon vastustajansa maalirajan taakse, ja samalla est�� palloa ylitt�m�st� omaa maalirajaansa. Perinteisest� Pongista poiketen maila voi liikkua my�s vaaka-akselilla, ja sit� ohjataan hiiren tai muun osoitinlaitteen avulla.

Sovelluksen tarkoitus on viihdytt��.


## Pelin s��nn�t

 - Pelin alussa pallo alkaa satunnaisesti valitun pelaajan alueella liikkumattomana. Jos pelaaja ei ly� palloa 10 sekunnin kuluessa, ottelu peruuntuu.
 - Pallon ylitt�ess� pelaajan maalirajan, vastakkainen pelaaja saa pisteen.
 - Pallon on ylitett�v� keskiraja, jotta sit� voidaan ly�d� uudelleen.
 - Pisteen j�lkeen pallo alkaa pisteen saaneen pelaajan alueella liikkumattomana. Jos pelaaja ei ly� palloa 5 sekunnin kuluessa, vastustajalle tuomitaan piste.
 - Pelaaja voittaa, jos h�nell� on kaikkiaan viisi pistett� tai enemm�n, ja kahden tai useamman pisteen johtoasema.


## Perusversion toiminnallisuus

 - K�ytt�j� voi pelata tietokonetta vastaan.
	- K�ytt�j� voi valita helpon tai vaikean tietokonevastustajan.
 - K�ytt�j�n tulokset tallennetaan, ja niit� voi tarkastella j�lkeenp�in.


## K�ytt�liittym�

Perusversiossa eri toimintojen k�ytt� aloitetaan k�ynnist�m�ll� ohjelma komentorivist� eri argumentein. Aputoiminto selostaa ohjelman k�yt�n.


## Jatkokehitysideoita

 - Graafinen valikko.
 - Moninpeli verkon v�lityksell�
	- Otteluhistoriaan perustuva ranking-luku (paikallisesti s�ilytetty -- herkk� pelaaja saa tahtoessaan muokata)
	- Nelinpeli (ep�todenn�k�inen)
	- Lobby-palvelin tai botti, joka v�litt�� haasteita ja pit�� kirjaa tuloksista ja rankingeista (ep�todenn�k�inen)
 - Replay-j�rjestelm�, jolla voi toistaa kokonaisia otteluita tallennetun pelitapahtumalokin pohjalta (eritt�in ep�todenn�k�inen)
