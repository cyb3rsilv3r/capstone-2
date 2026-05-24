package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Order testOrder =  new Order();
Pizza testPizza = new Pizza(
        PizzaSize.MEDIUM,
        CrustType.CAULIFLOWER,
        false,
        true
);
testPizza.addSide(Sides.PARMESAN);
testPizza.addRegularTopping(RegularToppings.ONIONS);
testPizza.addSauce(Sauces.BUFFALO);
testPizza.addPremiumTopping(PremiumToppings.BACON);

 testOrder.addPizza(testPizza);

        }// end of psvm
    }//end of main
