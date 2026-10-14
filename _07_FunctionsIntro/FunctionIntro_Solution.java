void main()
{
    // Übung 1
    String someStr = "Hallo";

    String  test1 = someStr.toUpperCase();
    char[]  test2 = someStr.toCharArray();
    boolean test3 = someStr.contains("lo");

    // Übung 2
    int sum = add(13, 47);
    IO.println(sum);

    // Übung 3
    double result = calcPercent(200.0, 25);
    IO.println(result);
}

// Funktion zu Übung 2
int add(int number1, int number)
{
    return number1 + number;
}

// Funktion zu Übung 3
double calcPercent(double number, int percentage)
{
    return number * percentage / 100;
}