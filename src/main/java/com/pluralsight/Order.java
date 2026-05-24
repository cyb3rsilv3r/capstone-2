package com.pluralsight;

import java.util.ArrayList;

public class Order {
    ArrayList<Pizza> pizzas;

    ArrayList<Drink> drinks;
    ArrayList<SideOrder> sideOrders;

    public Order(ArrayList<Pizza> pizzas, ArrayList<Drink> drinks, ArrayList<SideOrder> sideOrders) {
        this.pizzas = pizzas;
        this.drinks = drinks;
        this.sideOrders = sideOrders;
    }
//empty constructor added to use in main
    public Order() {

    }

    // getters
    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public ArrayList<Drink> getDrinks() {
        return drinks;
    }

    public ArrayList<SideOrder> getSideOrders() {
        return sideOrders;
    }

    //methods
    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void addDrinks(Drink drink) {
        drinks.add(drink);
    }

    public void addSideOrder(SideOrder sideOrder) {
        sideOrders.add(sideOrder);
    }
}
