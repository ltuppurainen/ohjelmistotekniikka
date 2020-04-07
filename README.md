# MousePong \[ !!! HUOM: Kehitys ja kurssityö keskeytetty 7.4.2020. !!! \]
Hiirellä pelattava pingispeli, tehty kurssityönä Helsingin Yliopiston ohjelmistotekniikan kurssille kevätlukukaudella 2020.

## Dokumentointi
 * [alustava vaatimusmäärittely](https://github.com/ltuppurainen/ohjelmistotekniikka/blob/master/dokumentointi/vaatimusmaarittely.md)
 * [työaikakirjanpito](https://github.com/ltuppurainen/ohjelmistotekniikka/blob/master/dokumentointi/tyoaikakirjanpito.md)

## Komentorivitoiminnot
Suorittaaksesi:
```
mvn compile exec:java -Dexec.mainClass=Application.Main
```

Testataksesi:

```
mvn test
```

Luodaksesi kattavuusraportin:

```
mvn jacoco:report
```
