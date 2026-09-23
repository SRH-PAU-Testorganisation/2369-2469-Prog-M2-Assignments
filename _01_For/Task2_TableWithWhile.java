void main()
{
    int number = 10;
    IO.println("| Zahl | mal Zwei |");
    IO.println("|------|----------|");
    while (number <= 30)
    {
        int num_doubled = number * 2;
        IO.println("|   " + number + " |       " + num_doubled + " |");
        number++;
    }
}