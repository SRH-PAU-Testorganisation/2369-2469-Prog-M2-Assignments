void main()
{
    Double price = Double.parseDouble(IO.readln("Geben Sie einen Preis ein: "));
    Double discountedPrice = calculateDiscount(price);
    IO.println("Rabattierter Preis: " + discountedPrice);
}

double calculateDiscount(double price)
{
    // Es wird bei unter 100€ kein Rabatt engewendet
    if (price < 100)
    {
        return price;
    }

    // Rabatt von 10% anwenden
    return price * 0.9;
}