package com.pluralsight;

public class Drink {
    DrinkSize size;
    DrinkMenu type;

    public Drink(DrinkSize size, DrinkMenu type) {
        this.size = size;
        this.type = type;
    }
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


public String drinkSummary(){
        return "Drink Size: " + size +
        "\n Drink Choice: " + type +
            "\n Price: $" + drinkPrice();
}

}
