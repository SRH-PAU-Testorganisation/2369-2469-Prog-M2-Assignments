void main()
{
    String input = IO.readln("Gib eine Zahl ein: ");
    int position = Integer.parseInt(input);

    String[] shoppingList = {"Eier", "Mehl", "Zigaretten"};

    position--;

    shoppingList[position] = shoppingList[position] + " moin";

    IO.println(shoppingList[position] + " moin2");
}
