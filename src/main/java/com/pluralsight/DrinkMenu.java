package com.pluralsight;

public enum DrinkMenu {
    COKE(2.00, 2.50, 3.00),
    SPRITE(2.00, 2.50, 3.00),
    FANTA(2.00, 2.50, 3.00),
    DR_PEPPER(2.00, 2.50, 3.00),
    LEMONADE(2.00, 2.50, 3.00);

    private final double smallPrice;
    private final double mediumPrice;
    private final double largePrice;

    DrinkMenu(double smallPrice, double mediumPrice, double largePrice) {

        this.smallPrice = smallPrice;
        this.mediumPrice = mediumPrice;
        this.largePrice = largePrice;
    }

    public double getSmallPrice() {
        return smallPrice;
    }

    public double getMediumPrice() {
        return mediumPrice;
    }

    public double getLargePrice() {
        return largePrice;
    }
    public double getPrice(DrinkSize size) {
        if (size == DrinkSize.SMALL) {
            return smallPrice;
        } else if (size == DrinkSize.MEDIUM) {
            return mediumPrice;
        } else {
            return largePrice;
        }
    }
}
