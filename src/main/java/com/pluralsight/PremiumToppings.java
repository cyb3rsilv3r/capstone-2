package com.pluralsight;

public enum PremiumToppings {
    PEPPERONI(1.00, 2.00, 3.00),
    SAUSAGE(1.00, 2.00, 3.00),
    HAM(1.00, 2.00, 3.00),
    BACON(1.00, 2.00, 3.00),
    CHICKEN(1.00, 2.00, 3.00),
    MEATBALL(1.00, 2.00, 3.00),

    //CHEESES
    MOZZARELLA(0.75, 1.50, 2.25),
    PARMESAN(0.75, 1.50, 2.25),
    RICOTTA(0.75, 1.50, 2.25),
    GOAT_CHEESE(0.75, 1.50, 2.25),
    BUFFALO(0.75, 1.50, 2.25);

    private final double personalPrice;

    private final double mediumPrice;

    private final double largePrice;
    PremiumToppings(double personalPrice, double mediumPrice, double largePrice) {
        this.personalPrice = personalPrice;
        this.mediumPrice = mediumPrice;
        this.largePrice = largePrice;
    }

    public double getPersonalPrice() {
        return personalPrice;
    }
    public double getMediumPrice() {
        return mediumPrice;
    }
    public double getLargePrice() {
        return largePrice;
    }

    public double getPrice(PizzaSize size){
        if (size == PizzaSize.PERSONAL){
            return personalPrice;
        } else if (size == PizzaSize.MEDIUM) {
            return mediumPrice;
        }else {
            return largePrice;
        }
    }

}
