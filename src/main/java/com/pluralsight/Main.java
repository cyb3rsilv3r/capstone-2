package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Order testOrder = new Order();
        Pizza testPizza = new Pizza(
                PizzaSize.MEDIUM,
                CrustType.CAULIFLOWER,
                true,
                true
        );
        testPizza.addSide(Sides.PARMESAN);
        testPizza.addRegularTopping(RegularToppings.ONIONS);
        testPizza.addSauce(Sauces.BUFFALO);
        testPizza.addPremiumTopping(PremiumToppings.BACON);
        testPizza.addExtraTopping(ExtraToppings.EXTRA_CHEESE);
        testPizza.addExtraTopping(ExtraToppings.EXTRA_MEAT);

        Pizza testPizza2 = new Pizza(
                PizzaSize.PERSONAL,
                CrustType.REGULAR,
                false,
                false
        );
        testPizza2.addSauce(Sauces.MARINARA);
        testPizza2.addRegularTopping(RegularToppings.PINEAPPLE);
        testPizza2.addRegularTopping(RegularToppings.OLIVES);

        Drink testDrink = new Drink(DrinkSize.SMALL, DrinkMenu.DR_PEPPER);
        Drink testDrink2 = new Drink(DrinkSize.MEDIUM, DrinkMenu.FANTA);

        testOrder.addDrinks(testDrink);
        testOrder.addDrinks(testDrink2);
        testOrder.addPizza(testPizza);
        testOrder.addSideOrder(SideOrder.GARLIC_KNOTS);
        testOrder.addSideOrder(SideOrder.CHEESY_BREAD);
        testOrder.addPizza(testPizza2);
        System.out.println(testOrder.orderSummary());
    }// end of psvm
}//end of main
