package day10_array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,4,4,5,6,7));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list) {
            if(!result.contains(each)){
                result.add(each);
            }
        }

        System.out.println(result);
    }
}
/*
8. Create a class called RemoveDuplicates and write a program with the following specifications:
   8.1 Given an ArrayList of integers, remove duplicated numbers.

			Example:
				list = [1,1,2,2,3,3,4,4,5,6,7]

			Output:
				[1,2,3,4,5,6,7]
 */