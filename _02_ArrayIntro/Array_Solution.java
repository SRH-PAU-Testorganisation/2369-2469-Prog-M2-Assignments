void main()
{
    IO.println("===== Aufgabe 1 =====");
    int[] zahlen_a = {10, 20, 30, 40, 50};

    IO.println(zahlen_a[0]); // (1.) erste  Zahl: Index 0
    IO.println(zahlen_a[2]); // (3.) dritte Zahl: Index 2
    IO.println(zahlen_a[4]); // (5.) fünfte Zahl: Index 4


    IO.println("===== Aufgabe 2 =====");
    int[] zahlen_b = {10, 20, 30, 40, 50};

    zahlen_b[1] = 99; // Wert 20 (zweites Element) überschreiben
    zahlen_b[4] = 77; // Wert 50 (fünftes Element) überschreiben

    IO.println(zahlen_b[0]);
    IO.println(zahlen_b[1]);
    IO.println(zahlen_b[2]);
    IO.println(zahlen_b[3]);
    IO.println(zahlen_b[4]);


    IO.println("===== Aufgabe 3 =====");
    int[] zahlen_c = {4, 7, 2, 9, 1};

    for (int i = 0; i < 5; i++)
    {
        IO.println(zahlen_c[i]);
    }

    IO.println("===== Aufgabe 4 =====");
    int[] zahlen_d = {4, 7, 2, 9, 1};

    for (int i = 0; i < 5; i++)
    {
        IO.println("Index " + i + ": " + zahlen_c[i]);
    }
}