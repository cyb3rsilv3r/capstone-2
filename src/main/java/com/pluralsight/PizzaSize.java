package com.pluralsight;

public enum PizzaSize {
    PERSONAL(8.50),
    MEDIUM(12.00),
    LARGE(16.50);

    private final double basePrice;

    PizzaSize(double basePrice) {
        this.basePrice = basePrice;
    }

}
