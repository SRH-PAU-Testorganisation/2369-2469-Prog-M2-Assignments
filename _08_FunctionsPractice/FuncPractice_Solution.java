void main()
{
    IO.println("=== Aufgabe 1 ===");
    IO.println("a = 1.0, b = 1.00001 | getBigger => " + getBigger(1.0, 1.00001));
    IO.println("a = 10,  b = 9       | getBigger => " + getBigger(10, 9));
    IO.println("a = 2.5, b = 2.5     | getBigger => " + getBigger(2.5, 2.5));

    IO.println(); // Leerzeile für besseren Überblick
    IO.println("=== Aufgabe 2 ===");
    int[] myNumbers = {7, 4, 9, 2, 3};
    IO.println("Nummern: 7, 4, 9, 2, 3");
    IO.println("Summe: " + sumNumbers(myNumbers));

    IO.println();
    IO.println("=== Aufgabe 3 ===");
    int[] myOtherNumbers = {7, 4, 0, 3, 12};
    IO.println("Nummern: 7, 4, 0, 3, 12");
    IO.println("Davon gerade:");
    printEvenValues(myOtherNumbers); // Eine erneute Ausgabe mit println() ist nicht notwendig, da das in der Funktion schon passiert. Es reicht der Funktionsaufruf.

    IO.println();
    IO.println("=== Aufgabe 4 ===");
    IO.println("Mahngebühr bei -999 Tagen: " + calculateOverdueFine(-999) + "€");
    IO.println("Mahngebühr bei    0 Tagen: " + calculateOverdueFine(0) + "€");
    IO.println("Mahngebühr bei    2 Tagen: " + calculateOverdueFine(2) + "€");
    IO.println("Mahngebühr bei    7 Tagen: " + calculateOverdueFine(7) + "€");
    IO.println("Mahngebühr bei    9 Tagen: " + calculateOverdueFine(9) + "€");
    IO.println("Mahngebühr bei   20 Tagen: " + calculateOverdueFine(20) + "€");
}

// Aufgabe 1
double getBigger(double a, double b)
{
    if (a > b)
    {
        return a;
    }
    else
    {
        return b;
    }
}

// Aufgabe 2
// Diese Funktion summiert alle Zahlen im übergebenen int-Array auf
// und gibt das Ergebnis als Integer zurück.
int sumNumbers(int[] numbers)
{
    int sum = 0;
    for (int i = 0; i < numbers.length; i++)
    {
        sum += numbers[i];
    }
    return sum;
}

// Aufgabe 3
boolean isEven(int num)
{
    return num % 2 == 0;
}
void printEvenValues(int[] values)
{
    for (int i = 0; i < values.length; i++)
    {
        if (isEven(values[i]))
        {
            IO.println(values[i]);
        }
    }
}

// Aufgabe 4
double calculateOverdueFine(int daysLate)
{
    double lightFee = 0.5;
    double heavyFee = 1;
    double megaFee  = 10;

    // Keine Fristüberschreitung
    if (daysLate <= 0)
    {
        return 0;
    }

    // Fristüberschreitung in drei Abstufungen
    if (daysLate < 6)
    {
        return daysLate * lightFee; // Tag 1 bis 5
    }
    else if (daysLate < 14)
    {
        return (5 * lightFee)                  // Tag 1 bis 5
                + ((daysLate - 5) * heavyFee); // Tag 6 bis 13
    }
    else
    {
        return (5 * lightFee)           // Tag 1 bis 5
                + ((13 - 5) * heavyFee) // Tag 6 bis 13
                + megaFee;              // Pauschale
    }
}
