package day07_class_objects_part1;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the product name:");
        String product = scanner.nextLine();

        System.out.println("Please enter the price: ");
        double price = scanner.nextDouble();

        System.out.println("Please enter the quantity:");
        int quantity = scanner.nextInt();

        System.out.println("Please enter your first name:");
        String name = scanner.next();

        scanner.close();

        double total = quantity * price;

        System.out.println(name + ", your order for " + quantity + " " + product + " has been placed. Your total is " + total + ".");

    }
}
/*
10. Create a class named PlaceAnOrder:

    Ask the user to enter the product name (multiple words).
    Ask the user to enter the price (double).
    Ask the user to enter the quantity (int).
    Ask the user to enter their first name (String, single word).

    Print in the following format:

        Example:
             Inputs: "Apples", 1.5, 5, "Luke"

        Output:
             Luke, your order for 5 Apples has been placed. Your total is 7.5.

 */