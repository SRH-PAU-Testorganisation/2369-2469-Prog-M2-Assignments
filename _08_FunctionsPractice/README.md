# Aufgabe 1
Implementieren Sie eine Funktion `getBigger(...)`, die als Parameter zwei `double`
entgegegennimmt und den größeren der beiden Werte als Rückgabewert hat.
Versuchen Sie, auf Hilfsvariablen zum Zwischenspeichern von Werten zu verzichten.

**Tipp:** Eine Funktion kann mehr als nur ein `return`-Statement haben.

# Aufgabe 2
Betrachten Sie den untenstehenden Code.
- Beschreiben Sie kurz, was der Zweck des Codes ist.
- Schreiben Sie den Code nun so um, dass sich die Logik in einer Funktion mit einem Parameter undRückgabewert befindet. Stellen Sie dazu folgende Überlegungen an:
    - Geben Sie der Funktion einen aussagekräftigen Namen, die den Zweck wiederspiegelt.
    - Was sollte die Funktion als Parameter entgegennehmen, d.h. was ist die Eingabe, die
    von außerhalb kommt?
    - Welchen Rückgabewert sollte die Funktion haben?
    - Welcher Teil des Codes gehört logisch zur Funktionalität? Welcher nicht?
- Abschließend soll die Funktion in einer Main-Methode aufgerufen und das Ergebnis auf die Konsoleausgegeben werden.

```java
int[] numbers = {7, 4, 9, 2, 3};
int sum = 0;

for (int i = 0; i < numbers.length; i++)
{
    sum += numbers[i];
}

IO.println(sum);
```

# Aufgabe 3
Teilen Sie eine kleine Übungsaufgabe
- Implementieren Sie eine Funktion `isEven()`, die als Parameter ein `int` engegennimmt und
  zurückgibt, ob die Zahl gerade oder ungerade ist. Überlegen Sie sich hierzu,
  welcher Datentyp für den Rückgabewert sinnvoll ist.
  Bei Bedarf können Sie mit mehreren `return`-Statements arbeiten.
- Definieren Sie nun eine zweite Funktion `printEvenValues()`,
  die als Parameter ein `int`-Arrayentgegennimmt. Diese Funktion soll keinen Rückgabewert
  haben, sondern alle geraden Zahlen im Array direkt auf die Konsole ausgeben.
  Hierzu sollen Sie die Funktion `isEven()`, die Sie implementiert haben, aufrufen.
- Prüfen Sie Ihre Funktion `printEvenValues()` per Aufruf in der Main-Methode mit
  folgendem `int`-Array: `{7, 4, 0, 3, 12}`.
  Die Ausgabe auf der Konsole sollen dann die Zahlen 4, 0 und 12 sein.
  Überlegen Sie sich hierzu, wie Sie eine Methode ohne Rückgabewert aufrufen.
  Was ist beim Aufruf dann überflüssig?

# Aufgabe 4
Eine Bücherei berechnet die Mahngebür für zu spät zurückgebrachte Bücher.
Als Eingabe liegt Ihnen ein int `daysLate` vor, der besagt, wie viele Tage zu spät ein Buch zurückgebracht wurde.
Die Regeln zur Kalkulation der Mahngebür sehen folgendermaßen aus:
- Wurde das Buch nicht zu spät zurückgebracht (d.h. `daysLate` ist 0), beträgt die
  Mahngebühr 0 €
- Für die ersten 5 Tage: 0,50 € Mahngebür pro Tag
- Ab dem 6. Tag: 1 € pro Tag
- Ab 14 Tagen kommen pauschal 10 € noch hinzu

Gibt jemand beispielsweise sein Buch 7 Tage zu spät ab, beträgt die Mahngebür:
`5 * 0.50€ + 2 * 1€ = 4,50€`.

- Implementieren Sie zunächst nur den Funktionskopf der Funktion, d.h. Name, Parameter
  und Datentyp des Rückgabewerts. Welche Überlegungen müssen Sie hierfür anstellen?
- Schreiben Sie nun den Funktionskörper und rufen die Funktion anschließend in der 
  Main-Methode mit folgenden Werten für `daysLate` auf: 0, 2, 9, 20.
