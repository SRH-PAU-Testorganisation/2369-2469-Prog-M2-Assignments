# Code zu PAP
Folgende Diagramme sind _mögliche_ Darstellung für die Java-Musterlösungen in
`_03_ArrayGrades/GradeCalc_Solution.java`

## Aufgabe 1 (Musterlösung)
In diesem PAP wird der User zu Beginn nach der Anzahl der Noten gefragt.
Diese Logik müsste in der Musterlösung noch ergänzt werden. Z. B. so:
```java
String userInput = IO.readln("Wie viele Noten sollen eingetragen werden? ");
double[] grades  = new double[Integer.parseInt(userInput)];
```
```mermaid
flowchart
    Start((Start))
    -->
    InpGrAmount[/E: Wie viele Noten sollen eingetragen werden?/]
    -->
    ForGrAmountInp{Hat der User alle\nNoten eingrtragen?}
    --nein-->
    InpGr[/E: Geben Sie eine Note ein!/]
    -->
    SaveGr[Note merken]
    -->
    ForGrAmountInp
    --ja-->
    ForGrAmountOutp{Wurden\n alle Noten\n ausgegeben?}
    --nein-->
    OutpGr[/"A: Nächste (bzw. erste) Note"/]
    -->
    ForGrAmountOutp
    --ja-->
    Next[[Weiter in\nAufgabe 2]]
```

## Aufgabe 2 (Musterlösung)
```mermaid
flowchart
    Start((Start))
    -->
    Init[Summe = 0\nDurchschnitt = 0]
    -->
    ForGrAmount{Alle Noten\n aufaddiert?}
    --nein-->
    Add[Nächste Note auf Summe addieren]
    -->
    ForGrAmount
    --ja-->
    OutpSum[/"A: Summe"/]
    -->
    CalcAvg[Durchschnitt = Summe / Anzahl Noten]
    -->
    OutpAvg[/"A: Durchschnitt"/]
    -->
    Next[[Weiter in\nAufgabe 3]]
```

## Aufgabe 3 (Musterlösung)
```mermaid
flowchart
    Start((Start))
    -->
    Init[Anzahl gute Noten = 0]
    -->
    ForGrAmount{Alle Noten\n iteriert?}
    --nein-->
    sdf[Nächste Note betrachten]
    -->
    IfGood{Note ist gut?}
    --ja-->
    Add[Anzahl gute Noten += 1]
    -->
    ForGrAmount
    IfGood{Note ist gut?}
    --nein-->
    ForGrAmount
    --ja-->
    OutpAvg[/"A: Anzahl der guten Noten"/]
    --->
    Ende((Ende))
```
