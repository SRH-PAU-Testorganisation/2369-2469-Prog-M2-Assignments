void main()
{
    // Nutzen Sie diese Datei (diesen Ordner), um kurz was auszuprobieren
    // oder gemeinsame Übungen aus dem Skript mitzumachen.

    String inp = IO.readln("Gib Zahl: ");
    int index = Integer.parseInt(inp);

    IO.println(texts[index - 1]);
}