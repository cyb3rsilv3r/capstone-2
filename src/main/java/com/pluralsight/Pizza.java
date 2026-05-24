package com.pluralsight;

import java.util.ArrayList;

public class Pizza {
    PizzaSize size;
    CrustType crust;
    ArrayList<Sauces> sauces;
    ArrayList<Sides> sides;
    ArrayList<RegularToppings> regularToppings;
    ArrayList<PremiumToppings> premiumToppings;
    boolean extraToppings;
    boolean crustStuffed;


    public Pizza(PizzaSize size, CrustType crust, ArrayList<Sauces> sauces, ArrayList<Sides> sides, ArrayList<RegularToppings> regularToppings, ArrayList<PremiumToppings> premiumToppings, boolean extraToppings, boolean crustStuffed) {
        this.size = size;
        this.crust = crust;
        this.sauces = sauces;
        this.sides = sides;
        this.regularToppings = regularToppings;
        this.premiumToppings = premiumToppings;
        this.extraToppings = extraToppings;
        this.crustStuffed = crustStuffed;
    }

    public PizzaSize getSize() {
        return size;
    }

    public CrustType getCrust() {
        return crust;
    }

    public ArrayList<Sauces> getSauces() {
        return sauces;
    }

    public ArrayList<Sides> getSides() {
        return sides;
    }

    public ArrayList<RegularToppings> getRegularToppings() {
        return regularToppings;
    }

    public ArrayList<PremiumToppings> getPremiumToppings() {
        return premiumToppings;
    }

    public boolean isExtraToppings() {
        return extraToppings;
    }

    public boolean isCrustStuffed() {
        return crustStuffed;
    }
}



