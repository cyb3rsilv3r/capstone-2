package com.pluralsight;

public enum ExtraToppings {
    //PREMIUM EXTRAS
    //CHEESES
    EXTRA_CHEESE(0.30, 0.60, 0.95),
    MOZZARELLA(0.30, 0.60, 0.95),
    PARMESAN(0.30, 0.60, 0.95),
    RICOTTA(0.30, 0.60, 0.95),
    GOAT_CHEESE(0.30, 0.60, 0.95),
    BUFFALO(0.30,0.60,0.95),

    //MEATS
    EXTRA_MEAT(0.50, 1.00, 1.50),
    PEPPERONI(0.50, 1.00, 1.50),
    SAUSAGE(0.50, 1.00, 1.50),
    HAM(0.50, 1.00, 1.50),
    BACON(0.50, 1.00, 1.50),
    CHICKEN(0.50, 1.00, 1.50),
    MEATBALL(0.50, 1.00, 1.50),

    //REGULAR EXTRAS
    ONIONS( 0 , 0,0 ),
    MUSHROOMS(0,0,0),
    BELL_PEPPERS(0,0,0),
    OLIVES(0,0,0),
    TOMATOES(0,0,0),
    SPINACH(0,0,0),
    BASIL(0,0,0),
    PINEAPPLE(0,0,0),
    ANCHOVIES(0,0,0);
// make sure to use a comma not a semicolon or u end the enum early

private final double smallPrice;
private final double mediumPrice;
private final double largePrice;

    ExtraToppings(double smallPrice, double mediumPrice, double largePrice) {
        this.smallPrice = smallPrice;
        this.mediumPrice = mediumPrice;
        this.largePrice = largePrice;
    }
    public double getPrice(PizzaSize size){
        if (size == (PizzaSize.PERSONAL) ){
            return smallPrice;
        } else if (size == PizzaSize.MEDIUM) {
            return mediumPrice;
        }else {
            return largePrice;
        }
    }

}

