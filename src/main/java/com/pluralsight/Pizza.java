package com.pluralsight;

import java.util.ArrayList;

public class Pizza {

    PizzaSize size;
    CrustType crust;
    ArrayList<Sauces> sauces;
    ArrayList<Sides> sides;
    ArrayList<RegularToppings> regularToppings;
    ArrayList<PremiumToppings> premiumToppings;
    ArrayList<ExtraToppings> extraToppingsList;
    boolean wantsExtraToppings;
    boolean crustStuffed;

    //variables i had to add on to help my methods run smoother
    String pizzaSummary;
    double total;
    //quick method to name each pizza for ease of output
private String pizzaName;
    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public Pizza(PizzaSize size, CrustType crust, boolean extraToppings, boolean crustStuffed) {

        this.size = size;
        this.crust = crust;
        this.wantsExtraToppings = extraToppings;
        this.crustStuffed = crustStuffed;

        this.sauces = new ArrayList<>();
        this.sides = new ArrayList<>();
        this.regularToppings = new ArrayList<>();
        this.premiumToppings = new ArrayList<>();
        this.extraToppingsList = new ArrayList<>();
    }

    //added pricing to sizing
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

    public boolean isWantsExtraToppings() {
        return wantsExtraToppings;
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

    public void addExtraTopping(ExtraToppings extraTopping) {
        if (isWantsExtraToppings()) {
            extraToppingsList.add(extraTopping);
        }
    }

    public double getValue() {
        total = 0;
        total += size.getPrice();

        for (PremiumToppings toppings : premiumToppings) {
            total += toppings.getPrice(size);
        }
        for (ExtraToppings extraToppings : extraToppingsList) {
            total += extraToppings.getPrice(size);
        }
        return total;
    }

    public String pizzaSummary() {
        return  "Pizza name: "+ pizzaName +
                "\nsize: " + size +
                "\n Crust: " + crust +
                "\n Sauces: " + sauces +
                "\n Sides: " + sides +
                "\n Regular Toppings: " + regularToppings +
                "\n Premium Toppings: " + premiumToppings +
                "\n Extra Toppings: " + (wantsExtraToppings ? "Yes" : "No") +
                "\n Stuffed Crust: " + (crustStuffed ? "Yes" : "No") +
                "\n Total: $" + getValue();
    }
}