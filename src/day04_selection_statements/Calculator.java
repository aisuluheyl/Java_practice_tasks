package day04_selection_statements;

public class Calculator {

    public static void main(String[] args) {

        double n1 = 10;
        double n2 = 20;


        char mathOperator = '*';

        double result = 0;

       /* if(mathOperator == '-'){
            System.out.println(n1 - n2);
        }else if (mathOperator == '+'){
            System.out.println(n1 + n2);
        }else if (mathOperator == '*'){
            System.out.println(n1 * n2);
        }else if (mathOperator == '/'){
            System.out.println(n1/n2);
        }else{
            System.out.println("invalid operator");
        }


        */

        if(mathOperator == '+'){
            result = n1 + n2;
        }

        if(mathOperator == '-'){
            result = n1 - n2;
        }

        if(mathOperator == '*'){
            result = n1 * n2;
        }

        if(mathOperator == '/'){
            result = n1 / n2;
        }

        System.out.println(result);

    }
}
/*
SWITCH:

10. Create a class called Calculator. Given two double variables named n1 and n2 and a char
variable named mathOperator, write a program that calculates the result of n1 and n2 based on
the given math operator.

		char operator -> -, +, *, /

		When the operator is +: add n1, n2
		When the operator is -: subtract n1, n2
		When the operator is *: multiply n1, n2
		When the operator is /: divide n1, n2
		For any other operators, print "invalid operator."

            Example:
                  n1 = 10, n2 = 20, mathOperator = '+'

            Output:
                  30
 */