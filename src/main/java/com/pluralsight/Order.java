package com.pluralsight;

import java.util.ArrayList;

public class Order {
    ArrayList<Pizza> pizzas;
    ArrayList<Drink> drinks;
    ArrayList<SideOrder> sideOrders;

    public Order(ArrayList<Pizza> pizzas, ArrayList<Drink> drinks, ArrayList<SideOrder> sideOrders) {
        this.pizzas = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.sideOrders = new ArrayList<>();
    }
//empty constructor added to use in main
    public Order() {
pizzas = new ArrayList<>();
drinks = new ArrayList<>();
sideOrders = new ArrayList<>();
    }
//// private variables to be able to call other classes
//    private Pizza pizza;
//    private Drink drink;
//    private SideOrder sideOrder;

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

    public String orderSummary() {
        double total = 0;
        String summary = "ORDER SUMMARY\n";

        for (Pizza pizza : pizzas) {
            summary += "\nPizza Overview:\n" +
                    pizza.pizzaSummary() + "\n Pizza Subtotal: $" +
            pizza.getValue();
            total += pizza.getValue();
        }

        for (Drink drink : drinks) {
            summary += "\nDrink Overview:\n" +
                    drink.drinkSummary() +
                    "\n Drink Price: $"+
                    drink.getValue();
            total += drink.getValue();
        }

        for (SideOrder sideOrder : sideOrders) {
            summary += "\nSide Order Overview:\n" + sideOrder.sideOrderSummary() + "\n";
            total += sideOrder.getPrice();
        }

        return  summary +"\n Grand Total: $" + total;
    }
}
