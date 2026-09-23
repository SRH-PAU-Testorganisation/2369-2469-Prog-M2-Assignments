# Refactoring: von _while_ zu _for_

Die vier Java-Dateien in diesem Verzeichnis sollten Ihnen bekannt vorkommen.
Das sind die Lösungen zu einigen Übungsaufgaben aus Modul 1. In diesen Aufgaben
ging es um die `while`-Schleife.

Ihre Aufgabe ist es, diese Dateien der Reihe nach umzuschreiben (auch "refactoring" genannt):

**Aus allen `while`-Schleifen sollen `for`-Schleifen werden.**

Dabei sollen die Programme die gleiche Ausgabe produzieren wie vorher. Sie sollen also
nichts an der Logik der Software ändern. Kopieren Sie dazu jede Datei und bennen Sie
sie wie folgt um:

| Vorlage mit `while`-Schleife        | Ihre Lösungsdatei mit `for`-Schleife |
|-------------------------------------|--------------------------------------|
| `Task1_SumWithWhile.java`           | `Task1_SumWithFor.java`              |
| `Task2_TableWithWhile.java`         | `Task2_TableWithFor.java`            |
| `Task3_MissingUpdateWithWhile.java` | `Task3_MissingUpdateWithFor.java`    |
| `Task4_WarumUpWithWhile.java`       | `Task4_WarumUpFor.java`              |

In den neuen Dateien bauen Sie nun jede `while`-Schleife um zu einer `for`-Schleife.
# Syntax: `for`-Schleife

Folgene Schleife:
```java
int i = 0;
while (i < 10)
{
    // ...
    i++;
}
```
... kann auch so geschrieben werden:
```java
for (int i = 0; i < 10; i++)
{
    // ...
}
```

Drei Ausdrücke werden in den Schleifenkopf geschrieben: `for (A; B; C)`:
- **A:**
  Dieser Ausdruck wird **nur einmal** vor Beginn des ersten Durchgangs ausgeführt.
  Meistens wird hier eine Zählvariable initialisiert.
- **B:**
  Hier steht der boolesche Ausdruck für die Abbruchbedingung, wie Sie Ihn schon aus
  der `while`-Schleife kennen: Solbald die Bedingung `false` ist, wird die Schleife beendet.
- **C:**
  Dieser Ausdruck wird immer am Ende eines Durchganges ausgeführt. Hier wird normalerweise
  die Zählvariable (aus A) hoch/runter gezählt. Diesen Ausdrück könnten Sie auch als letzen
  Befehl in den Schleifenkörper schreiben.
  Er steht aber oben mit im Schleifenkopf für bessere Lesbarkeit.

Die `for`-Schleife wird fast immer wie im oberen Beispiel verwendet.
Sie können aber beliebige Ausdrücke verwenden, solange die Syntax es erlaubt:
```java
for (double piePiece = 1.0; piePiece > 0.1; piePiece = piePiece / 2.0)
{
    IO.println("Kuchenstück: " + piePiece);
}
```
Alle drei Ausdrück sind optional und können auch leer gelassen werden. In diesem Beispiel
wurden sogar alle drei Ausdrücke weggelassen:
```java
while(true) { ... }
for(;;) { ... }
```