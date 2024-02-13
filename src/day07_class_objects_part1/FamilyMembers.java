package day07_class_objects_part1;

import java.util.Scanner;

public class FamilyMembers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many people do you live with?");
        int number = scanner.nextInt();

        scanner.close();

        String result = "";
        result = (number < 3) ? "Live with less than three people." : (number < 6) ? "Live with 3 - 6 people." : "Live with more than six people.";

        System.out.println(result);

    }

}
/*
5. Create a class named FamilyMembers and write a program that asks the user how many people they live with.

    If the user lives with fewer than three people, print "Live with less than three people."
    If the user lives with 3 - 6 people, print "Live with 3 - 6 people."
    If the user lives with more than six people, print "Live with more than six people."

        Example:
             How many people do you live with?
             Input: 3

        Output:
             Live with 3 - 6 people.
 */