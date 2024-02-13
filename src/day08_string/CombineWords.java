package day08_string;

import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first word:");
        String firstWord = scanner.next();

        System.out.println("Please enter the second word:");
        String secondWord = scanner.next();

        scanner.close();

        String result = "";

        if(secondWord.charAt(0) == firstWord.charAt(firstWord.length() -1)){
            result = firstWord + secondWord.substring(1);
        }else{
            result =firstWord + secondWord;
        }

        System.out.println(result);
    }
}
/*
3. Create a class named CombineWords. Ask the user to enter two words. Then, add them together and print. But if the
last letter of the first word and the first letter of the second word are the same, print that character once.

        Example:
              Input:
                 one
                 eight

              Output:
                   oneight

 */