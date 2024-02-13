package day09_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ClassMatesInitials {

    public static void main(String[] args) {

        String[] names = {"Aisulu Heyl", "Amel Kadric", "Adam Saleh", "Muhtar Jr", "Windia Windy", "Paul Melnyk", "Mohammed M ", "Jamal S"};

        for (int i = 0; i < names.length; i++) {
            String initials = names[i].charAt(0) + "." + names[i].charAt(names[i].indexOf(" ") + 1);
            System.out.println(initials);
        }


    }

}
/*
2. Create a class named ClassMatesInitials and write a program with the following specifications:
   2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines.
 */