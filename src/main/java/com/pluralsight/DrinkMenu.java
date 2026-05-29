package com.pluralsight;

public enum DrinkMenu {
    RADIATOR_COLA(2.00, 2.50, 3.00),
    DELUXE_HOSE_WATER(2.00, 2.50, 3.00),
    CITRUS_ANTIFREEZE(2.00, 2.50, 3.00),
    MOUNTAIN_DONT(2.00, 2.50, 3.00),
    MYSTERY_LEMONADE(2.00, 2.50, 3.00);

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
