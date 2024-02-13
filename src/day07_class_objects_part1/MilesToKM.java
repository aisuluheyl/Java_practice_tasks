package day07_class_objects_part1;

import java.util.Scanner;

public class MilesToKM {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("PLease enter the miles amount:");
        double miles = scanner.nextDouble();

        scanner.close();

        double kilometers = miles * 1.609;

        System.out.println(miles + " miles is equal to " + kilometers + " kilometers");


    }
}
/*
9. Create a class named MilesToKM and write a program that asks the user to enter the number of miles and
convert it to kilometers.

        Example:
             Enter the miles:
             Input: 10.0

        Output:
             10.0 miles is equal to 16.09 kilometers
 */