package day07_class_objects_part1;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the radius of the circle:");
        int radius = scanner.nextInt();

        scanner.close();

        double area = 3.14 * radius * radius;
        double perimeter = 2 * 3.14 * radius;

        System.out.println("The area of the circle is " + area + "\nThe perimeter of the circle is " + perimeter);
    }
}
/*
6. Create a class named Circle and write a program that asks the user to enter the radius of the Circle and calculate
the area and perimeter of the Circle.

        Example:
             Enter the radius:
             Input: 5

        Output:
             The area of the Circle is 78.5
             The perimeter of the Circle is 31.4
 */