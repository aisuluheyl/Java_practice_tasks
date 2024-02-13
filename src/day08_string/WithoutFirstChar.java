package day08_string;

import java.util.Scanner;

public class WithoutFirstChar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first word:");
        String firstWord = scanner.next();

        System.out.println("Please enter the second word:");
        String secondWord = scanner.next();

        scanner.close();

       /* firstWord = firstWord.substring(1);
        secondWord = secondWord.substring(1);

        System.out.println(firstWord + secondWord);

        */

        String result = firstWord.substring(1) + secondWord.substring(1);

        System.out.println(result);
    }
}
/*
2. Create a class named WithoutFirstChar. Ask the user to enter two words. Print the first word without its
first character, then print the second word without its first character.

        Example:
              Inputs:
                  apple
                  banana

              Output:
                   ppleanana

 */