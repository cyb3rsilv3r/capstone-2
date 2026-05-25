package com.pluralsight;

public enum SideOrder {
    GARLIC_KNOTS(1.50),
    ZEPPOLES(1.50),
    ONION_RINGS(1.50),
    CHEESY_BREAD(1.50),
    TIRAMISU(1.50);


    private final double price;


    SideOrder(double price) {
        this.price = price;
    }
public String sideOrderSummary(){

    String SideOrder = "";
    return "Side Order: " + this +
            "\n Price: $" + price;
}

    public double getPrice() {
        return price;
    }
}

