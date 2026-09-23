void main()
{
    int number = 0;

    IO.println();
    IO.println("Aufgabe 4");
    IO.println();
    while (number <= 20)
    {
        IO.println(number);
        number++;
    }

    IO.println("---");
    number = 0;
    while (number <= 20)
    {
        IO.println(number);
        number += 2;
    }

    IO.println("---");
    number = 20;
    while (number >= 0)
    {
        IO.println(number);
        number--;
    }

    IO.println("---");
    number = 20;
    while (number >= 0)
    {
        IO.println(number);
        number -= 3;
    }
}