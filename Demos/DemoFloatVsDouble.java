void main()
{
    // ============== Darstellung in der Konsole ===============
    IO.println("=== output ===");
    IO.println(" 1 Nachkommastelle:  " + 0.5f);
    IO.println(" 2 Nachkommastellen: " + 0.55f);
    IO.println(" 3 Nachkommastellen: " + 0.505f);
    IO.println(" 4 Nachkommastellen: " + 0.5005f);
    IO.println(" 5 Nachkommastellen: " + 0.50005f);
    IO.println(" 6 Nachkommastellen: " + 0.500005f);
    IO.println(" 7 Nachkommastellen: " + 0.5000005f);
    IO.println(" 8 Nachkommastellen: " + 0.50000005f);
    IO.println(" 9 Nachkommastellen: " + 0.500000005f);
    IO.println("10 Nachkommastellen: " + 0.5000000005f);

    // ======================== FLOAT =========================
    float number_as_float =         0.1f;
    int multiplier        = 1_000_000   ;

    float result_f = 0f;
    for (int i = 0; i < multiplier; i++)
    {
        result_f += number_as_float;
    }

    IO.println();
    IO.println("=== float ===");
    IO.println(number_as_float + " aufaddiert:    " + result_f);
    IO.println(number_as_float + " multipliziert: " + (number_as_float * multiplier));

    // ======================== DOUBLE ========================
    double number_as_double = 0.1f;

    double result_d = 0f;
    for (int i = 0; i < multiplier; i++)
    {
        result_d += number_as_double;
    }

    IO.println();
    IO.println("=== double ===");
    IO.println(number_as_double + " aufaddiert:    " + result_d);
    IO.println(number_as_double + " multipliziert: " + (number_as_double * multiplier));
}
