package com.pluralsight;

public enum ExtraToppings {
    EXTRA_CHEESE(0.30, 0.60, 0.95),
    EXTRA_MEAT(0.50, 1.00, 1.50);
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

