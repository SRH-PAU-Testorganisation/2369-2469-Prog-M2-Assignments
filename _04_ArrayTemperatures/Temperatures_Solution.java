void main()
{
    IO.println(Integer.MAX_VALUE);

    double[] temperatures = new double[7];

    // Eingabe
    for (int i = 0; i < temperatures.length; i++)
    {
        String userInput      = IO.readln("Geben Sie eine Temperatur ein: ");
        double newTemperature = Double.parseDouble(userInput);
        temperatures[i]       = newTemperature;
    }

    // Berechnungen (Aufgabe 1)
    double temperaturesSum = 0;
    double temperatureMax  = -99999999; // Eine sehr kleine Zahl würde auch funktionieren
    double temperatureMin  = 999999999; // Eine sehr große Zahl würde auch funktionieren
    for (int i = 0; i < temperatures.length; i++)
    {
        // Für die einfachere lesbarkeit
        double currentTemperature = temperatures[i];

        // Durchschnitt (vorbereiten)
        temperaturesSum += currentTemperature;

        // Höchste Temperatur
        if (temperatureMax < currentTemperature)
        {
            temperatureMax = currentTemperature;
        }

        // Niedrigste Temperatur
        // Hier darf temperatureMin nicht mit einer kleinen Zahl initialisiert worden sein!
        if (temperatureMin > currentTemperature)
        {
            temperatureMin = currentTemperature;
        }
    }
    double temperatureAverage = temperaturesSum / temperatures.length;

    // Ausgabe
    IO.println("Durchschnitt: "          + temperatureAverage);
    IO.println("Höchste Temperatur: "    + temperatureMax);
    IO.println("Niedrigste Temperatur: " + temperatureMin);

    // Temperaturen über dem Durchschnitt (Aufgabe 2)
    IO.println("Temperaturen über dem Durchschnitt:");
    for (int i = 0; i < temperatures.length; i++)
    {
        if (temperatures[i] > temperatureAverage)
        {
            IO.println("Index " + i + ": " + temperatures[i]);
        }
    }
}