package day06_methods;

public class MaximumAndMinimum {

    public static void main(String[] args) {

        int result = maximumNumber(10,30);

        System.out.println(result);

        int result2 = minimumNumber(43, 78);

        System.out.println(result2);

        double result3 = maximumNumber(45.5, 98.7);

        System.out.println(result3);

        double result4 = minimumNumber(75.5, 87.4);

        System.out.println(result4);
    }

    public static int maximumNumber(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static double maximumNumber(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static int minimumNumber(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static double minimumNumber(double num1, double num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
/*
3. Create a class named MaximumAndMinimum:

	2.1 Create a method named max that returns the maximum number between two integer numbers.

	2.2 Create a method named max that returns the maximum number between two double numbers.

	2.3 Create a method named min that returns the minimum number between two integer numbers.

	2.4 Create a method named min that returns the minimum number between two double numbers.


			Example1:
				double n = max(10.5, 30.2);

			Output:
				30.2

			Example2:
				int m = min(100, 200);

			Output:
				100

 */