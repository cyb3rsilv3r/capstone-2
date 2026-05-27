package com.pluralsight;

import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        displayHomeScreen();
    }


    //• Home Screen
    public static void displayHomeScreen() throws IOException {
// Add Scanner
        Scanner scanner = new Scanner(System.in);

        boolean running = true; // controls if app keeps running

//     The application should continue to run until the user chooses to exit.
//need a loop here
        while (running) {

            System.out.println(" Welcome to Silvers Pizzeria");
            System.out.println("Pizza Sign goes here");

            System.out.println("Please select ur option: ");
            System.out.println("1. new order");
            System.out.println("2. exit");

//get user input here
            int choice = scanner.nextInt();
            // make a case switch for the first menu
            switch (choice){
                case 1:

                    break;
                case 2:

break;




            }

        }
    }// end of psvm
}//end of main
