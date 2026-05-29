package com.pluralsight;

import java.io.IOException;
import java.util.Scanner;

public class OrderScreen {
    // add my scanner
    Scanner scanner = new Scanner(System.in);

    //Method to avoid user input errors.
    private int userErrorFixer(int maxChoice) {

        while (true) {
// use try catch to display my error message
            try {
// account for what kind of input errors im handling
                String input = scanner.nextLine().trim();// handles spacing

                int choice = Integer.parseInt(input);// turning the string to an int so i can still use my enums
// make an if statement to cover out of range input
                if (choice < 1 || choice > maxChoice) {
// use the enums value list to determine the range of allowed input w/ maxChoice
                    System.out.println("Please choose a valid option.");

                } else {

                    return choice;
                }
            } catch (NumberFormatException e) {

                System.out.println(" that is not an option we have for you");
            }
        }
    }// end of error stopper

    //Add pizza to order
    public String pizzaName() {
        System.out.print("Name this pizza: ");
        return scanner.nextLine();
        // pizza.setPizzaName(pizzaName); <- gonna need that when ui is done
    }


    //PIZZA SIZE
    // make display "helper" methods private
    private void displayPizzaSize() {
        int counter = 1;
        System.out.println("Pizza Sizes");
        //.values lists all the items in the enum
        for (PizzaSize pizzaSize : PizzaSize.values()) {
            System.out.println(counter + ". " + pizzaSize);
            counter++;
        }
    }//end of pizza size

    // make the choice int so users can use numbers to pick from te toppings list
    private PizzaSize choosePizzaSize() {

        displayPizzaSize();
        System.out.println(" Select Pizza Size: ");
        int choice = userErrorFixer(PizzaSize.values().length);
        PizzaSize[] sizes = PizzaSize.values();
        return sizes[choice - 1]; //do the -1 so index starts at zero
    }

    //PIZZA CRUST
    private void displayPizzaCrusts() {
        int counter = 1;
        System.out.println("Our Crispy Crusts");
        for (CrustType crustType : CrustType.values()) {
            System.out.println(counter + ". " + crustType);  //needs art
            counter++;
        }
    }// end of crusts

    public CrustType chooseCrustType() {
        int choice;
        System.out.println("Choose your crust: ");
        choice = userErrorFixer(CrustType.values().length);
        CrustType[] crustTypes = CrustType.values();
        return crustTypes[choice - 1];
    }// end of crust types

    //SAUCES
    private void displaySauces() {
        System.out.println("Our Sauces");
        int counter = 1;
        for (Sauces sauce : Sauces.values()) {
            System.out.println(counter + ". " + sauce);
            counter++;
        }
    }

    private Sauces chooseSauce() {
        displaySauces();
        int choice;
        System.out.println(" Choose your sauce: ");
        choice = userErrorFixer(Sauces.values().length);
        Sauces[] sauceType = Sauces.values();
        return sauceType[choice - 1];

    }

// TOPPINGS STUFF

    //PREMIUM TOPPINGS
    private void displayPremiumToppings() {
        int counter = 1;
        System.out.println("Premium Topping");
        for (PremiumToppings premiumToppings : PremiumToppings.values()) {
            System.out.println(counter + ". " + premiumToppings);
            counter++;
        }
    }// end of display premium toppings

    public PremiumToppings choosePremTops() {
        int choice;
        System.out.println("Select Premium Toppings: ");
        choice = userErrorFixer(PremiumToppings.values().length);
        PremiumToppings[] premiumToppings = PremiumToppings.values();
        return premiumToppings[choice - 1];
    }

    public void addPremiumToppingsToPizza(Pizza pizza) {
// this counter shows how many topping u can still put on
        int premiumCounter = 0;

        while (premiumCounter < 2) {
            displayPremiumToppings();
            PremiumToppings topping = choosePremTops();
            pizza.addPremiumTopping(topping);

            // use counter variable and display it to show how many free premium toppings left
            System.out.print("Premium toppings left: " + (1 - premiumCounter));
            String answer = scanner.nextLine();
            premiumCounter++;
        }// my fav code block
    }


    //REGULAR TOPPINGS
    public void displayRegularToppings() {
        int counter = 1;
        System.out.println(" Our scrumptious toppings");
        for (RegularToppings regularToppings : RegularToppings.values()) {
            System.out.println(counter + ". " + regularToppings);
            counter++;
        }
    }

    public RegularToppings chooseRegToppings() {
        int choice;
        System.out.println("Select Regular Toppings: ");
        choice = userErrorFixer(RegularToppings.values().length);
        try {
            RegularToppings[] regularToppings = RegularToppings.values();
            return regularToppings[choice - 1];
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }// end of choose regular toppings

    public void addRegularToppingsToPizza(Pizza pizza) {
        boolean adding = true;
        int toppingCounter = 0;
// make a while loop to account for no. of toppings and skipping them too
        while (adding && toppingCounter < 9) {
            displayRegularToppings();
            RegularToppings topping = chooseRegToppings();
            pizza.addRegularTopping(topping);

            // use counter variable and display it to show how many free premium toppings left
            System.out.print("Topping spots left: " + (8 - toppingCounter));
            String answer;
            toppingCounter++;

            // add an if statement so they do nt have to add all 9 toppings
            if (toppingCounter < 8) {
                System.out.print("\nAdd another regular topping? y/n: ");
                answer = scanner.nextLine();
//dont have to add value for why since  it alr assumes true
                if (answer.equalsIgnoreCase("n")) {
                    adding = false;
                }
            }
        }

    }


    //DRINK MENU
    private void displayDrinkMenu() {
        int counter = 1;
        System.out.println("Our Yummy Drinks!");
        for (DrinkMenu drinks : DrinkMenu.values()) {
            System.out.println(counter + ". " + drinks);
            counter++;
        }
    }// end of display drinks

    public DrinkMenu chooseDrink() {
        displayDrinkMenu();
        int choice;
        System.out.println("Select Drink");
        choice = userErrorFixer(DrinkMenu.values().length);
        //  scanner.nextLine();
        DrinkMenu[] drinkMenus = DrinkMenu.values();
        return drinkMenus[choice - 1];
    }//end of choose drink

    private void displayDrinkSize() {
        System.out.println("how much are you wanting to sip?");
        int counter = 1;
        for (DrinkSize drinkSize : DrinkSize.values()) {
            System.out.println(counter + ". " + drinkSize);
            counter++;
        }
    }

    public DrinkSize chooseDrinkSize() {
        displayDrinkSize();
        int choice = userErrorFixer(DrinkSize.values().length);
        DrinkSize[] drinkSizes = DrinkSize.values();
        return drinkSizes[choice - 1];
    }//end of choose drink size

    //SIDE ORDER MENU
    private void displaySideOrderMenu() {
        int counter = 1;
        System.out.println("Our Side Orders");
        for (SideOrder sideOrder : SideOrder.values()) {
            System.out.println(counter + ". " + sideOrder);// needs art here
            counter++;
        }
    }

    public SideOrder chooseSideOrders() {
        int choice;
        displaySideOrderMenu();
        SideOrder[] sideOrders = SideOrder.values();
        choice = userErrorFixer(SideOrder.values().length);
        return sideOrders[choice - 1];
    }

    public void checkout(Order order) throws IOException {

        System.out.println("{Checkout!}");
        //checkout flow

        //  validate order
        if (!order.isValidOrder()) {
            System.out.println("If you're not getting pizza, you gotta get a drink or garlic knots. ☠︎︎");
            return;
        } else {
            // show order summary
            System.out.println(order.orderSummary());
        }
        // confirm order
        System.out.println("Confirm order? y/n");
        String answer = scanner.nextLine().trim();
        // make a quick boolean to accept answer
        boolean orderCorrect = answer.equalsIgnoreCase("y");

        // if statement to write receipt or start alllll over
        if (orderCorrect) {
            ReceiptFileManager receiptFileManager = new ReceiptFileManager();
            receiptFileManager.saveReceipt(order);
        }
    }

    // PIZZA MAKING UI STUFF
    public void orderMenu() throws IOException {
        int choice;
        // make a boolean to make the order menu loop
        boolean ordering = true;
        Order order = new Order();
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
                    PizzaSize size = choosePizzaSize();
                    //crust
                    displayPizzaCrusts();
                    CrustType crust = chooseCrustType();

                    //create new pizza to add remaining variables
                    Pizza pizza = new Pizza(size, crust, false, false);
                    // name
                    String pizzaName = pizzaName();
                    pizza.setPizzaName(pizzaName);

// stuffed crust
//?? do I need one for stuffed crust? tbd
//sauce
                    Sauces sauce = chooseSauce();
                    pizza.addSauce(sauce);
//premium toppings
                    addPremiumToppingsToPizza(pizza);
//regular toppings
                    addRegularToppingsToPizza(pizza);
// add finished pizza to order!!! yayy finally!!
                    order.addPizza(pizza);
                    break;
                case 2://ADD DRINK
                    DrinkMenu drink = chooseDrink();
                    DrinkSize drinkSize = chooseDrinkSize();
                    // make new drink object ao add to order
                    Drink newDrink = new Drink(drinkSize, drink);
                    // need to add drink to order
                    order.addDrinks(newDrink);

                    //needs loop to add multiple drinks
                    break;
                case 3: //Add Side Orders

                    SideOrder sideOrder = chooseSideOrders();
                    // add sides to order as well
                    order.addSideOrder(sideOrder);
                    //     needs loop to add multiple sides too
                    break;
                case 4: // checkout
                    checkout(order);    //here is where order summary goes
                    // if order is good at confirmation then save the order else run a loop to start over or exit entirely
                    ordering = false;
                    break;
                case 0: // cancel order ( use .remove to extract from order object)
                    // do not do that actually just stop the loop and maybe ask to restart?
                    ordering = false;
                    break;
                //todo add default case for invalid input
//make sure to do a confirmation of the cancellation


            }

        }
    }//end of class
}




