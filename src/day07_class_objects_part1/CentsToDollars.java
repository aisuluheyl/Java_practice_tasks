package day07_class_objects_part1;

import java.util.Scanner;

public class CentsToDollars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the cents amount:");
        int initialCents = scanner.nextInt();

        scanner.close();

        int dollars = initialCents / 100;

        int remainderCents = initialCents % 100;
        // int remainderCents = initialCents - (100 * dollars);

        System.out.println(initialCents + " is equal to " + dollars + " dollars " + remainderCents + " cents");


    }
}
/*
8. Create a class named CentsToDollars and write a program that asks the user to enter the number of cents and
convert the given cents to dollars. Include any remainder in the result.

        Example:
             Enter the cents:
             Input: 225

        Output:
             225 cents is equal to 2 dollars and 25 cents
 */