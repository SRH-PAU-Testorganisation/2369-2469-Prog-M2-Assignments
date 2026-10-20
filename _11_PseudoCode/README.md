# Pseudocode

Schauen Sie sich folgende Funktion an:
```java
int sumArray(int[] array)
{
    int sum = 0;
    for (int i = 0; i < array.length; i++)
    {
        sum = sum + array[i];
    }
    return sum;
}
```
Pseudocode ist im Grunde ein ähnlicher Ansatz wie PAPs um Abläufe zu beschreiben.
In _Pseudocode_ kann diese Funktion auf verschiedene Arten beschrieben werden, die
unterschiedlich formal sind.

Eine eher formale Version (niedriges "Abstraktionslevel") sähe so aus:
```
Funktion sumArray(A):
    S = 0
    Für jedes Element x in A:
        S = S + x
    Gib S zurück
Ende Funktion
```

Eine weniger formale Version (hohes "Abstraktionslevel") könnte so aussehen:
```
Initialisiere die Summe mit 0.
Für jedes Element im Array:
   Addiere den Wert des Elements zur Summe.
Gib die Summe zurück.
```

Es ist eine vereinfachte, "halb-formale" Beschreibung eines Algorithmus oder
Programms. Er wird verwendet, um die Logik eines Programms darzustellen, ohne sich an
die exakte Syntax einer Programmiersprache halten zu müssen.
Ziel von Pseudocode ist es, den Ablauf eines Programms für Menschen klar und verständlich zu erklären. Für Maschinen ist er nicht geeignet.

Hier einige Eigenschaften von Pseudocode:
- Keine festgelegte Syntax
- Mischung aus natürlicher Sprache und Programmierstruktur
- Lesbar für Programmierer und Nicht-Programmierer
- Oft verwendet in Planung, Lehre und technischen Dokumentationen

## Aufgabe

Schauen Sie sich nochmal Ihre Lösung in Ihrem Notenrechner an (`_03_ArrayGrades/`) oder
die entsprechende Musterlösung (`_03_ArrayGrades/GradeCalc_Solution.java`)
und **beschreiben Sie die Teilaufgaben als Pseudocode.**

Wählen Sie, wie bei der PAP-Übung, ein für Sie passendes "Abstraktionslevel".
Pseudocode lässt sich oft sehr leicht Zeile für Zeile übersetzen.
Orientieren Sie sich lieber am Code als an den PAP-Darstellungen.
