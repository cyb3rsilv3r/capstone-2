# ☢︎ Silver’s Definitely Legal Roadkill Pizzeria ☢︎

## Overview

Silver’s Definitely Legal Roadkill Pizzeria is a Java console application built for Capstone 2. The application allows customers to fully customize pizza orders through an interactive ordering system while automatically calculating totals and generating receipt files.

The project uses a chaotic roadside “roadkill pizzeria” theme with custom ASCII art, cursed menu item names, and humorous receipt formatting to give the application personality while still meeting all technical requirements.

“where every meal is a hit”

---

## Features

### Pizza Customization

Customers can:

* Choose pizza size
* Choose crust type
* Add sauces
* Add premium toppings
* Add regular toppings
* Add stuffed crust
* Name each pizza individually

### Additional Ordering Features

* Add drinks
* Add side orders
* Place orders with multiple pizzas
* Place orders with only drinks or side orders
* Automatically calculate order totals

### Receipt System

* Receipts are automatically generated after checkout
* Each receipt is saved as its own `.txt` file
* Receipt files use timestamp naming
* Receipts are saved inside the `receipts` folder

Example:
20260529-031522.txt

### Error Handling

The application includes custom user input validation to:

* Prevent crashes from invalid input
* Reject non-numeric menu choices
* Reject out-of-range menu options
* Continuously prompt until valid input is entered

### Aesthetic Features

* Custom ASCII art menus
* Roadkill-themed menu items
* Styled receipt formatting
* Chaotic roadside restaurant branding

---

## Technologies Used

* Java
* IntelliJ IDEA
* Git
* GitHub

---

## Object-Oriented Programming Concepts Used

This project makes use of several OOP principles including:

* Classes and objects
* Constructors
* Encapsulation
* Enums
* ArrayLists
* Composition
* Helper methods
* File handling
* Inheritance concepts for signature pizzas

---

## Project Structure

### Main Classes

* `Main` → controls application startup and home screen loop
* `OrderScreen` → handles all menu navigation and user interaction
* `Order` → stores pizzas, drinks, side orders, and calculates totals
* `Pizza` → stores pizza customization data and pricing
* `Drink` → stores drink information
* `ReceiptFileManager` → handles receipt file generation

### Enums

* Pizza sizes
* Crust types
* Sauces
* Premium toppings
* Regular toppings
* Drinks
* Side orders

---

## Challenges

One of the hardest parts of the project was implementing the receipt system. Debugging file creation, folder generation, timestamp naming, and making sure receipts saved correctly required a lot of troubleshooting and testing.

Another challenge was designing reusable input validation that prevented the application from crashing when users entered invalid data.

---

## Favorite Feature

One of my favorite features is the topping counter system. While building a pizza, the user can see how many toppings they still have left to add. This feature combined loops, counters, conditionals, enums, and user interaction into one system while improving the overall user experience.

---

## UML Diagram

The project includes a UML class diagram showing the structure of the application and relationships between classes.
<img width="3714" height="1310" alt="capstone2_uml" src="https://github.com/user-attachments/assets/03bd143f-a0b5-4298-85a4-e4f94c29a8cb" />

---

## Author

Silver
