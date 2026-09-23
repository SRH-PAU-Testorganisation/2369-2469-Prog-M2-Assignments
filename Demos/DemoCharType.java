void main()
{
    // Seit Java 18 ist UNICODE (UTF-16) der Standardzeichensatz

    // Ausgabe 1
    char my_char = 'A';
    IO.println("char   A        as charakter: " + my_char);

    // "short" zu "char" konvertieren (in diesem Fall "casten")
    short my_short = 65;
    char  my_other_char = (char)my_short;

    // Ausgabe 2
    IO.println("short  65       as charakter: " + my_other_char);

    // Mit dem 0b-Präfix kann man Binärzahlen im Quelltext schreiben
    short my_short_from_binary = 0b1000001;
    char  yet_another_char = (char)my_short_from_binary;

    // Ausgabe 3
    IO.println("binary 01000001 as charakter: " + yet_another_char);
}
