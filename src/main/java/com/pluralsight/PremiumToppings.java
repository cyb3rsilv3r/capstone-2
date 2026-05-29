package com.pluralsight;

public enum PremiumToppings {
    ROADSIDE_VENISON(1.00, 2.00, 3.00),
    GROUNDHOG_SAUSAGE(1.00, 2.00, 3.00),
    BOAR_HAM(1.00, 2.00, 3.00),
   MYSTERY_BACON(1.00, 2.00, 3.00),
    STREET_CHICKEN(1.00, 2.00, 3.00),
    LUCKY_MEATBALL(1.00, 2.00, 3.00),

    //CHEESES
   AGED_OPOSSUM_MOZZARELLA(0.75, 1.50, 2.25),
    BASICALLY_PARMESAN(0.75, 1.50, 2.25),
    RICOTTA_ADJACENT(0.75, 1.50, 2.25),
    SEMI_HOMEMADE_GOAT_CHEESE(0.75, 1.50, 2.25),
    WE_THINK_ITS_BUFFALO(0.75, 1.50, 2.25);

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
