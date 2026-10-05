void main()
{
    double[] grades = new double[5];

    // ====== Aufgabe 1 ======

    // -- Eingabe --
    for (int i = 0; i < grades.length; i++)
    {
        // Usereingabe entgegennehmen
        String userInput = IO.readln("Geben Sie eine Note ein: ");

        // Eingabe konvertieren und speichern
        double newGrade  = Double.parseDouble(userInput);
        grades[i] = newGrade;
    }

    // -- Ausgabe --
    IO.println("Noten:");
    for (int i = 0; i < grades.length; i++)
    {
        IO.println(grades[i]);
    }

    // ====== Aufgabe 2 ======
    double gradesSum     = 0;
    double gradesAverage = 0;
    for (int i = 0; i < grades.length; i++)
    {
        gradesSum += grades[i];
        gradesAverage = gradesSum / (i + 1);
    }
    IO.println("Summe: "        + gradesSum);
    IO.println("Durchschnitt: " + gradesAverage);

    // ====== Aufgabe 3 ======
    int goodGradesSum = 0;
    for (int i = 0; i < grades.length; i++)
    {
        if (grades[0] < 2.5)
        {
            goodGradesSum++;
        }
    }
    IO.println("Anzahl \"gute\" Noten: " + goodGradesSum);

}