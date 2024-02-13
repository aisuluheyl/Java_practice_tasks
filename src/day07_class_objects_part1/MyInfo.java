package day07_class_objects_part1;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age:");
        int age = scanner.nextInt();

        System.out.println("Please enter your gender:");
        String gender = scanner.next();

        scanner.nextLine();

        System.out.println("Please enter your full name:");
        String fullName = scanner.nextLine();

        System.out.println("Please enter your phone number:");
        long phoneNumber = scanner.nextLong();

        System.out.println("Please enter your zip code:");
        int zipCode = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Please enter your school name:");
        String schoolName = scanner.nextLine();

        System.out.println("Please enter your city name:");
        String cityName = scanner.nextLine();

        System.out.println("Please enter your state name");
        String stateName = scanner.next();

        System.out.println("Please enter your building number");
        int bldgNumber = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Please enter your street name");
        String streetName = scanner.nextLine();

        scanner.close();

        System.out.println(fullName + "\n" + age + "\n" + gender + "\n" + phoneNumber + "\n\t" + bldgNumber + " " + streetName + "\n\t" + cityName + ", " + stateName + " " + zipCode);
    }
}
/*
11. Create a class called MyInfo and ask the user to:

      Enter your age (int)
      Enter your gender (String - One word ONLY)
      Enter your full name (String - Multiple words)
      Enter your phone number (long)
      Enter your zip code (int)
      Enter your School name (String - Can be Multiple words)
      Enter your city name (String - Can be Multiple words)
      Enter your state name (String - One word ONLY)
      Enter your building number (int)
      Enter your Street name

    Display all the inputs that the user entered in the following order in separate lines:

        Full name
        Age
        Gender
        Phone number
        Address:
             buildingNumber Street
             City, state zipCode

 */