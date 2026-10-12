void main()
{
    for (int i = 0; i < 30; i++)
    {
        // Wenn nur genau *ein* Befehl im if-Block folgt, kann man die geschweiften Klammern weglassen
        if (isAdult(i, "USA"))
            IO.println(i + " ist volljährig (USA)");
        else
            IO.println(i + " ist NICHT volljährig (USA)");
    }
}

boolean isAdult(int ageInYears, String iso3166CountryCode)
{
    int legalAgeGER = 18;
    int legalAgeUSA = 21;

    if (iso3166CountryCode.equals("GER"))
    {
        return ageInYears >= legalAgeGER;

        // Alternative mit if-Statement:
        // if (ageInYears >= legalAgeGER)
        // {
        //      return true;
        // }
        // else
        // {
        //      return false;
        // }
    }
    else if (iso3166CountryCode.equals("USA"))
    {
        return ageInYears >= legalAgeUSA;
    }
    else
    {
        IO.println("ERROR: Dieses Land EXISTIERT nicht => " + iso3166CountryCode);
        return false;
    }
}
