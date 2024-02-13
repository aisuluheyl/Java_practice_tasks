package day08_string;

import java.util.Scanner;

public class FullName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first name:");
        String firstName = scanner.next();

        System.out.println("Please enter your last name:");
        String lastName = scanner.next();

        scanner.close();

        firstName = format(firstName);
        lastName = format(lastName);

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

    }

    public static String format(String name){
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }


       /* String result = firstName.substring(0,1).toUpperCase() + firstName.substring(1)).toLowerCase() + " " + lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(result);
        */
    }

/*
6. Write a program that asks the user to enter first and last names and then prints the full name in regular format
(first character in uppercase).

        Example:
              Input:
                  firstName = "cyDEo";
                  lastName = "SCHOOL";

              Output:
                   Cydeo School
 */