package day08_string;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to split? (Yes or No)");
        String split = scanner.next().toLowerCase();

        System.out.println("Enter the number of people:");
        int people = scanner.nextInt();

        System.out.println("Enter the check amount ");
        double preTip = scanner.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String quality = scanner.next().toLowerCase();

        double tipRate = (quality.equals("excellent")) ? 0.25 : (quality.equals("great")) ? 0.2 : (quality.equals("good")) ? 0.15 : (quality.equals("fair")) ? 0.1 : 0.05;

         double totalTip = preTip * tipRate;

        System.out.println("Number of people entered: " + people);
        System.out.println("Total to pay: " + preTip);
        System.out.println("Total tip: " + totalTip);

        if (split.equalsIgnoreCase("Yes")){
            System.out.println("Total per person: " + (preTip/people));
            System.out.println("Tip per person: " + (totalTip/people) );
        }

    }
}
/*
7. Create a class called TipCalculator and write a program for a tip calculator. There will be different service
quality benchmarks that will determine the tip given. There will also be the ability to calculate based on the
number of people in the party and whether there is a split of the bill.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

      The program should ask the user to enter:
          - Split or No split (Yes or No),
          - Enter the number of people (number)
          - Enter the check amount (number)
          - Service Quality (String)

      And display the output in the following format:

            Example:
                  Split or No Split (Yes or No)?
                  Input: Yes
                  Enter the number of people:
                  Input: 4
                  Enter the check amount:
                  Input: 476
                  How was the service quality? (Excellent/Great/Good/Fair/Poor)
                  Input: Excellent

            Output:
                 Number of people entered: 4
                 Total to pay: 595.0
                 Total tip: 119.0
                 Total per person: 148.75
                 Tip per person: 29.75


 */