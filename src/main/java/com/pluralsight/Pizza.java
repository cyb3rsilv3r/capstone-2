package com.pluralsight;

public class Pizza {
    int size;
    String crust;
    String sauces;
    String sides;
    String topping;
    boolean extraToppings;
    boolean crustStuffed;


    public Pizza(int size, String crust, String sauces, String sides, String toppings, boolean extraToppings, boolean stuffCrust) {
        this.size = size;
        this.crust = crust;
        this.sauces = sauces;
        this.sides = sides;
        this.topping = toppings;
        this.extraToppings = extraToppings;
        this.crustStuffed = stuffCrust;
    }


    public int getSize() {

        return size;
    }

    public String getCrust() {
        return crust;
    }

    public String getSauces() {
        return sauces;
    }

    public String getSides() {
        return sides;
    }

    public String getTopping() {
        return topping;
    }

    public boolean isExtraToppings() {
        return extraToppings;
    }

    public boolean isCrustStuffed() {
        return crustStuffed;
    }


    }



