void main()
{
    int sum = 0;
    for (int number = 0; number <= 100; number++)
    {
        sum += number;
        IO.println("Durchlauf Nr. " + number + " => " + sum);
    }

    IO.println("Endergebnis: " + sum);
}