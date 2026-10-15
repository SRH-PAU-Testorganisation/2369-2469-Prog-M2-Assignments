void main()
{
    double[] gradeList = new double[5];

    // Eingabe
    for (int i = 0; i < gradeList.length; i++)
    {
        String inp = IO.readln("Gib eine Note ein: ");
        gradeList[i] = Double.parseDouble(inp);
    }

    // Ausgabe
    for (int i = 0; i < gradeList.length; i++)
    {
        IO.println(gradeList[i]);
    }
    IO.println();

    // Summe & Durchschnitt
    double summe = 0;
    for (int i = 0; i < gradeList.length; i++)
    {
        summe += gradeList[i];
    }
    IO.println("Summe: " + summe);
    IO.println("Durchschnitt: " + summe / gradeList.length);

    // Filtern
    int sumGoodGrades = 0;
    int sumBadGrades = 0;
    for (int i = 0; i < gradeList.length; i++)
    {
        if (gradeList[i] <= 2.0)
        {
            sumGoodGrades++;
        }
        else if (gradeList[i] >= 4.0)
        {
            sumBadGrades++;
        }
    }
    IO.println("Anzahl gute Noten: " + sumGoodGrades);
    IO.println("Anzahl schlechte Noten: " + sumBadGrades);
}