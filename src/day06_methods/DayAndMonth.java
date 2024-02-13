package day06_methods;

public class DayAndMonth {

    public static void main(String[] args) {

        displayDay(6);
        monthName(5);
        daysInMonth(8);


    }

    public static void displayDay(int number) {

        String result = "";

        if (number > 0 && number < 8) {

            result = (number == 1) ? "Monday" : (number == 2) ? "Tuesday" : (number == 3) ? "Wednesday" : (number == 4) ? "Thursday" : (number == 5) ? "Friday" : (number == 6) ? "Saturday" : "Sunday";
        } else {
            System.out.println("Invalid number");
        }
        System.out.println(result);
    }

    public static void monthName(int n) {

        String result = "";
        if (n >= 1 && n <= 12) {
            result = (n == 1) ? "January" : (n == 2) ? "February" :
                    (n == 3) ? "March" : (n == 4) ? "April" : (n == 5) ? "May" : (n == 6) ? "June" : (n == 7) ? "July" : (n == 8) ? "August" : (n == 9) ? "September" : (n == 10) ? "October" : (n == 11) ? "November" : "December";
        } else {
            System.out.println("Invalid number");
        }
        System.out.println(result);
    }

    public static void daysInMonth(int month) {
        String result = "";

        switch (month) {

            case 2:
                result = "28 days";
                break;

            case 1, 3, 5, 7, 8, 10, 12:
                result = "31 days";
                break;

            case 4, 6, 9, 11:
                result = "30 days";
                break;

            default:
                result = "Invalid number";
        }

        System.out.println(result);
    }
}
/*
4. Create a class named DayAndMonth:

	3.1 Create a method named day that displays the day's name based on the given number.
	If the number is invalid, print "Invalid Number".

			Example:
				day(5);

			Output:
				Friday

	3.2 Create a method named monthName that displays the month's name based on the given number.
	If the number is invalid, print "Invalid Number."


			Example:
				monthName(6);

			Output:
				June

	3.3 Create a method named daysInMonth that displays the number of days in the month based on the given number.
	If the number is invalid, print "Invalid Number."

				Example:
					daysInMonth(6);

				Output:
					June has 30 days
 */