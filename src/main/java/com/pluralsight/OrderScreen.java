package com.pluralsight;

import java.util.Scanner;

public class OrderScreen {
    int choice;
    Scanner scanner = new Scanner(System.in);

    //Add pizza to order
    public String pizzaName() {
        System.out.print("Name this pizza: ");
        String pizzaName = scanner.nextLine();
        return scanner.nextLine();
        // pizza.setPizzaName(pizzaName); <- gonna need that when ui is done
    }


    //PIZZA SIZE
    public void displayPizzaSize() {
        int counter = 1;
        for (PizzaSize pizzaSize : PizzaSize.values()) {
            System.out.println(counter + ". " + pizzaSize);
            counter++;
        }
    }//end of pizza size

    public PizzaSize choosePizzaSize(int choice) {
        System.out.println(" Select Pizza Size: ");
        choice = scanner.nextInt();
        scanner.nextLine();
        PizzaSize[] sizes = PizzaSize.values();
        return sizes[choice - 1]; //do the -1 so index starts at zero
    }

    //PIZZA CRUST
    public void displayPizzaCrusts() {
        int counter = 1;
        for (CrustType crustType : CrustType.values()) {
            System.out.println(counter + ". " + crustType);
            counter++;
        }
    }// end of crusts

    public CrustType chooseCrustType(int choice) {
        System.out.println("Choose your crust: ");
        choice = scanner.nextInt();
        scanner.nextLine();
        CrustType[] crustTypes = CrustType.values();
        return crustTypes[choice - 1];
    }// end of crust types

    //SAUCES
    public void displaySauces() {
        int counter = 1;
        for (Sauces sauce : Sauces.values()) {
            System.out.println(counter + ". " + sauce);
            counter++;
        }
    }


    //PREMIUM TOPPINGS
    public void displayPremiumToppings() {
        int counter = 1;
        for (PremiumToppings premiumToppings : PremiumToppings.values()) {
            System.out.println(counter + ". " + premiumToppings);
            counter++;
        }
    }// end of display premium toppings

    public PremiumToppings choosePremTopps(int choice) {
        System.out.println("Select Premium Toppings: ");
        choice = scanner.nextInt();
        scanner.nextLine();
        PremiumToppings[] premiumToppings = PremiumToppings.values();
        return premiumToppings[choice - 1];
    }


    //REGULAR TOPPINGS
    public void displayRegularToppings() {
        int counter = 1;
        for (RegularToppings regularToppings : RegularToppings.values()) {
            System.out.println(counter + ". " + regularToppings);
            counter++;
        }
    }

    public RegularToppings chooseRegToppings(int choice) {
        System.out.println("Select Regular Toppings: ");
        choice = scanner.nextInt();
        scanner.nextLine();
        RegularToppings[] regularToppings = RegularToppings.values();
        return regularToppings[choice - 1];
    }// end of choose regular toppings

    //DRINK MENU
    public void displayDrinkMenu() {
        int counter = 1;
        for (DrinkMenu drinks : DrinkMenu.values()) {
            System.out.println(counter + ". " + drinks);
            counter++;
        }
    }// end of display drinks

    public DrinkMenu chooseDrink(int choice) {
        System.out.println("Select Drink");
        choice = scanner.nextInt();
        scanner.nextLine();
        DrinkMenu[] drinkMenus = DrinkMenu.values();
        return drinkMenus[choice - 1];
    }//end of choose drink

    public void displayDrinkSize() {
        int counter = 1;
        for (DrinkSize drinkSize : DrinkSize.values()) {
            System.out.println(counter + ". " + drinkSize);
            counter++;
        }
    }

    public DrinkSize chooseDrinkSize(int choice) {
        System.out.println("Select drink size: ");
        DrinkSize[] drinkSizes = DrinkSize.values();
        return drinkSizes[choice - 1];
    }//end of choose drink size

    //SIDE ORDER MENU
    public void displaySideOrderMenu() {
        int counter = 1;
        for (SideOrder sideOrder : SideOrder.values()) {
            System.out.println(counter + ". " + sideOrder);
            counter++;
        }
    }

    public SideOrder chooseSideOrders(int choice) {
        SideOrder[] sideOrders = SideOrder.values();
        return sideOrders[choice - 1];
    }

    public void checkout(Order order) {
        if (!order.isValidOrder()) {
            System.out.println("If you're not getting pizza, you gotta get a drink or garlic knots.");
            return;
        }

        System.out.println(order.orderSummary());
        System.out.println("Confirm order?");

        // if yes: save receipt
        // if no: go back / cancel
    }


    // PIZZA MAKING UI STUFF
    public void orderMenu() {
//        int choice = 0;
        // make a boolean to make the order menu loop
        boolean ordering = true;

        while (ordering) {
            System.out.println("1. Add Pizza");
            System.out.println("2. Add Drink");
            System.out.println("3. Add Side Order");
            System.out.println("4. Checkout");
            System.out.println("0. Cancel Order");

            choice = scanner.nextInt();
            scanner.nextLine();
        switch (choice) {
            case 1: // add pizza
                // name
                pizzaName();
                String pizzaName = pizzaName();
// size
                displayPizzaSize();
                PizzaSize size = choosePizzaSize(0);
//crust
                displayPizzaCrusts();
                CrustType crust = chooseCrustType(0);

// stuffed crust

//sauce

//premium toppings
                displayPremiumToppings();
                PremiumToppings premiumToppings = choosePremTopps(0);
//regular toppings
                displayRegularToppings();
                RegularToppings regularToppings = chooseRegToppings(0);

                break;
            case 2://ADD DRINK
                displayDrinkMenu();
                DrinkMenu drink = chooseDrink(0);
                DrinkSize drinkSize = chooseDrinkSize(0);
                break;
            case 3: //Add Side Orders
                displaySideOrderMenu();
                SideOrder sideOrder = chooseSideOrders(0);
                break;
            case 4: // checkout
            checkout();    //here is where order summary goes
                break;
            case 5: // cancel order ( use .remove to extract from order object
//make sure to do a confirmation of the cancellation


        }

    }
}//end of class
}
