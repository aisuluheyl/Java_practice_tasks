package day04_selection_statements;

public class AgeGroups {

    public static void main(String[] args) {

        int age = 62;
        boolean isValid = age >= 0 && age < 150;

        String result = "";

        if (isValid) {

            if (age >= 55) {
                result = "Senior";
            } else if (age >= 21) {
                result = "Adult";
            } else {
                result = "Teenager";
            }

        } else {
            result = "Invalid";
        }

        System.out.println(result);
    }
}
/*
8. Create a class named AgeGroups. An integer variable named age is given.
	Write a program that can determine the age group of a person. The age groups are:

		Teenager (0 ~ 20)
		Adult   (21 ~ 55)
      Senior  (55 or older)

		If the age is negative or greater than 150, print "Invalid."


			Example:
				   age = 42

			Output:
				  Young Middle-Aged Adult
 */