# Römische Zahlen
Ein renommiertes Museum in Italien hat bei der Stuttgarter angerufen und uns Entwickler um Hilfe gebeten. 
Bei einer Ausgrabung wurde eine alte Schriftrolle entdeckt, welche Zahlencodes enthalten soll, mit denen eine Schatzkammer geöffnet werden kann. 
Unsere Mission, sofern wir diese annehmen, wäre es, die Zeichen der Schriftrolle auszulesen und so umzuwandeln, dass Zahlencodes entstehen, mit denen die Kammer geöffnet werden kann.

# Der Code
LXXXVII,CV,CXIV,XXXII,XCVIII,CI,CV,XXXII,C,CI,CXIV,XXXII,LXXXIII,CXVI,CXVII,CXVI,CXVI,CIII,XCVII,CXIV,CXVI,CI,CXIV,XXXII,LXXXVI,CI,CXIV,CXV,CV,XCVX,CIV,CI,CXIV,CXVII,CX,CIII,XXXII,CXV,CV,CX,C,XXXII,C,CV,CI,XXXII,XCVIII,CI,CXV,CXVI,CI,CX,XXXII,LXXX,CXIV,CXI,CIII,CXIV,XCVII,CVX,CVX,CV,CI,CXIV,CI,CXIV,XXXII,LVIII,XLI

# Die Aufgabe
Schreibe ein Programm das die römischen Zeichen in persische Zeichen umwandelt. Das Komma steht jeweils für eine neue Zahl. Als Ergebnis ergibt sich ein String von persichens Zahlen durch Komma getrennt. Z.B: 123,64,12
Diese können wiederumg durch eine bereits vorhandenes Programm in deutsche Schrift umgewandlet werden.

## Beispiele
```
Eingabe:     I Ausgabe:  1
Eingabe:    II Ausgabe:  2
Eingabe:   III Ausgabe:  3
Eingabe:  IIII Ausgabe:  4
Eingabe:    IV Ausgabe:  4
Eingabe:     V Ausgabe:  5
Eingabe:    VI Ausgabe:  6
Eingabe:   VII Ausgabe:  7
Eingabe:  VIII Ausgabe:  8
Eingabe: VIIII Ausgabe:  9
Eingabe:    IX Ausgabe:  9
Eingabe:     X Ausgabe: 10
Eingabe:     L Ausgabe: 50
Eingabe:     C Ausgabe: 100
Eingabe:     D Ausgabe: 500
Eingabe:     M Ausgabe: 1000
Eingabe:     MCMLXXXIV Ausgabe: 1984
```
Erweiterungen:
- Eingaben sind bis 3999(MMMCMXCIX) möglich.
- Unterstütze die Subtraktionsregel mit folgenden Regeln: ein I darf nur einmal vor V und X stehen, X darf nur einmal vor L und C stehen, C darf nur einmal vor D und M stehen.
- Prüfe mögliche Eingabefehler wie: die Römischen Zeichen müssen absteigend von links nach rechts sortiert sein und es dürfen nur maximal 4 gleiche Zeichen hintereinander stehen.
- Rechne Dezimalzahlen in Römische Zahlen um.
- https://www.roemische-zahlen.net/
