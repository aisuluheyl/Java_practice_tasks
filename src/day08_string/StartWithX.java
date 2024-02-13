package day08_string;

import java.util.Scanner;

public class StartWithX {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word:");
        String word = scanner.next();

        scanner.close();

        String result = "";

        if(word.startsWith("x")){
            result = word.replaceFirst("x", "a");
        }
        System.out.println(result);
    }
}
/*

1. Create a class named StartsWithX and write a program that asks the user to enter a word.
If the word starts with 'x,' replace it with 'a'.

        Example:
              Input:
                 xcodex

              Output:
                 acodex


 */