void main()
{
    String[] shoppingCart = {
            "Kornflakes",
            "Weißes Monster™️ Energy",
            "Tangliatelle",
            "Studentenfutter",
            "100 kg Kartoffeln",
            "Katzenfutter",
            "Gummibärchen",
            "Babyöl",
            "Eine Gurke"
    };

    String[] shoppingCart2 = shoppingCart;

    shoppingCart2[7] = "Noch mehr Kartoffeln";

    IO.println("Cart 1");
    for (int i = 0; i < shoppingCart.length; i++)
    {
        IO.println(shoppingCart[i]);
    }

    IO.println();
    IO.println("Cart 2");
    for (int i = 0; i < shoppingCart2.length; i++)
    {
        IO.println(shoppingCart2[i]);
    }
}