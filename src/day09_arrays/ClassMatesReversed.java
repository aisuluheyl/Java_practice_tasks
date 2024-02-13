package day09_arrays;

import java.util.Arrays;

public class ClassMatesReversed {

    public static void main(String[] args) {

        String[] names = {"Aisulu Heyl", "Amel Kadric", "Adam Saleh", "Muhtar Jr", "Windia Windy", "Paul Melnyk", "Mohammed Alnaimi ", "Jamal Saleh"};

        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            String reverseNames = "";

            for (int j = name.length() - 1; j >= 0; j--) {
                reverseNames += name.charAt(j);
            }
            System.out.println(reverseNames);
        }
    }
}
/*
6. Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.
 */