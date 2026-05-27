package com.pluralsight;

import java.util.Scanner;

public class OrderScreen {
    int choice;
    Scanner scanner = new Scanner(System.in);

    //Add pizza to order
    public String pizzaName() {
        System.out.print("Name this pizza: ");
        return scanner.nextLine();
        // pizza.setPizzaName(pizzaName); <- gonna need that when ui is done
    }


    //PIZZA SIZE
    public void displayPizzaSize() {
        int counter = 1;
        System.out.println("Pizza Sizes");
        //.values lists all the items in the enum
        for (PizzaSize pizzaSize : PizzaSize.values()) {
            System.out.println(  counter + ". " + pizzaSize);
            counter++;
        }
    }//end of pizza size
// make the choice int so users can use numbers to pick from te toppings list
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
            System.out.println( "Pizza Crusts" + "\n" + counter + ". " + crustType);  //needs art
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
        System.out.println("Our Sauces");
        int counter = 1;
        for (Sauces sauce : Sauces.values()) {
            System.out.println(counter + ". " + sauce);
            counter++;
        }
    }

    public Sauces chooseSauce(int choice) {
        System.out.println(" Choose your sauce: ");
        choice = scanner.nextInt();
        scanner.nextLine();
        Sauces[] sauceType = Sauces.values();
        return sauceType[choice - 1];
    }

// TOPPINGS STUFF

    //PREMIUM TOPPINGS
    public void displayPremiumToppings() {
        int counter = 1;
        System.out.println("Premium Topping");
        for (PremiumToppings premiumToppings : PremiumToppings.values()) {
            System.out.println(  counter + ". " + premiumToppings);
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

    public void addPremiumToppingsToPizza(Pizza pizza) {
        boolean adding = true;

        int premiumCounter = 0;

        while (premiumCounter < 2) {
            displayPremiumToppings();
            PremiumToppings topping = choosePremTopps(0);
            pizza.addPremiumTopping(topping);

            // use counter variable and display it to show how many free premium toppings left
            System.out.print("Premium toppings left: "+ (1 -premiumCounter));
            String answer = scanner.nextLine();
            premiumCounter++;
        }// my fav code block
    }


    //REGULAR TOPPINGS
    public void displayRegularToppings() {
        int counter = 1;
        for (RegularToppings regularToppings : RegularToppings.values()) {
            System.out.println( "Regular Toppings" + "\n "+ counter + ". " + regularToppings);
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

    public void addRegularToppingsToPizza(Pizza pizza) {
        boolean adding = true;
        int toppingCounter = 0;

        while (toppingCounter < 4) {
            displayRegularToppings();
            RegularToppings topping = chooseRegToppings(0);
            pizza.addRegularTopping(topping);

            // use counter variable and display it to show how many free premium toppings left
            System.out.print("Premium toppings left: "+ (1 -toppingCounter));
            String answer = scanner.nextLine();
            toppingCounter++;
            }
        }


    //DRINK MENU
    public void displayDrinkMenu() {
        int counter = 1;
        System.out.println("Our Yummy Drinks!");
        for (DrinkMenu drinks : DrinkMenu.values()) {
            System.out.println( counter + ". " + drinks);
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
        System.out.println("how much are you sipping?");
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
            System.out.println("Side Orders" + "\n "+ counter + ". " + sideOrder);// needs art here
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
                    //first collect choices to fill pizza constructor
// size
                    displayPizzaSize();
                    PizzaSize size = choosePizzaSize(0);
//crust
                    displayPizzaCrusts();
                    CrustType crust = chooseCrustType(0);

                    //create new pizza to add remaining variables
                    Pizza pizza = new Pizza(size, crust, false, false);
                    // name
                    pizzaName();
                    String pizzaName = pizzaName();
                    pizza.setPizzaName(pizzaName);

// stuffed crust
//?? do i need one for stuffed crust? tbd
//sauce
                    displaySauces();
                    Sauces sauce = chooseSauce(0);
                    pizza.addSauce(sauce);

//premium toppings
                    addPremiumToppingsToPizza(pizza);
//regular toppings
                    addRegularToppingsToPizza(pizza);
// add finished pizza to order!!! yayy finally!!

                    break;
                case 2://ADD DRINK
                    displayDrinkMenu();
                    DrinkMenu drink = chooseDrink(0);
                    DrinkSize drinkSize = chooseDrinkSize(0);
                    //needs loop to add multiple drinks
                    break;
                case 3: //Add Side Orders
                    displaySideOrderMenu();
                    SideOrder sideOrder = chooseSideOrders(0);
                    //     needs loop to add multiple sides too
                    break;
                case 4: // checkout
                    checkout(new Order());    //here is where order summary goes
                    break;
                case 5: // cancel order ( use .remove to extract from order object
//make sure to do a confirmation of the cancellation


            }

        }
    }//end of class
}
