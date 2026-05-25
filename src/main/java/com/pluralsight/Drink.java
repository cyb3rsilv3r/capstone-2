package com.pluralsight;

public class Drink {
    DrinkSize size;
    DrinkMenu type;

    public Drink(DrinkSize size, DrinkMenu type) {
        this.size = size;
        this.type = type;
    }

    // to get price use an if statement to link prices to sizes
    public double drinkPrice() {
        double price;
        if (size == DrinkSize.SMALL) {
            price = type.getSmallPrice();
            return price;

        } else if (size == DrinkSize.MEDIUM) {
            price =  type.getMediumPrice();
            return price;

        } else {
            price =  type.getLargePrice();
            return price;
        }
    }

    public double getValue(){
        return drinkPrice();
    }


public String drinkSummary(){
        return "Drink Size: " + size +
        "\n Drink Choice: " + type +
            "\n Price: $" + drinkPrice();
}

}
