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

    String pizzaSummary;

    public Pizza(PizzaSize size, CrustType crust, boolean extraToppings, boolean crustStuffed) {

        this.size = size;
        this.crust = crust;
        this.extraToppings = extraToppings;
        this.crustStuffed = crustStuffed;

        this.sauces = new ArrayList<>();
        this.sides = new ArrayList<>();
        this.regularToppings = new ArrayList<>();
        this.premiumToppings = new ArrayList<>();
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

    public void addSauce(Sauces sauce) {
        sauces.add(sauce);
    }

    public void addSide(Sides side) {
        sides.add(side);
    }

    public void addRegularTopping(RegularToppings topping) {
        regularToppings.add(topping);
    }

    public void addPremiumTopping(PremiumToppings topping) {
        premiumToppings.add(topping);
    }


    public String pizzaSummary() {
        return "size: " + size +
                "\n Crust: " + crust +
                "\n Sauces: " + sauces +
                "\n Sides: " + sides +
                "\n Regular Toppings: " + regularToppings +
                "\n Premium Toppings: " + premiumToppings;
    }
}