package com.pluralsight;

import java.util.Scanner;

public class OrderScreen {
    Scanner scanner = new Scanner(System.in);

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
        choice= scanner.nextInt();
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

}//end of class
