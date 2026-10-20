# PAP zu Code

**Lesen Sie zuerst die `mermaid.md`** und installieren Sie das _mermaid_-Plugin für IntelliJ (wie beschrieben).

## Ein- und Ausgabe
Ein- und Ausgabe wird mit einem Parallelogramm (einer "schiefen" Box) dargestellt. Was eine Eingabe oder eine Ausgabe ist,
ist aber nicht genormt. Wir werden im Unterricht Eingeben mit einem `E: ` und Ausgaben mit einem `A: ` kennzeichnen.
```mermaid
flowchart
    A[/E: Name Eingeben/]
    -->
    G[/A: Hallo X/]
```

## Aufgabe
Erstellen Sie eine Funktion `calculateDiscount()` und implementieren Sie die Logik aus
folgendem PAP. Ein- und Ausgabe sollen nicht _in_ der Funktion implementiert werden.

```mermaid
flowchart 
    A([Start]) --> B[/E: Einkaufswert einlesen/]
    B --> C{Einkaufswert >= 100?}
    subgraph Funktion
        C -- Ja --> D[Rabatt = Einkaufswert * 0.10]
        C -- Nein --> E[Rabatt = 0]
        D --> F[Endpreis = Einkaufswert - Rabatt]
        E --> F
    end
    F --> G[/A: Endpreis ausgeben/]
    G --> H([Ende])
```
