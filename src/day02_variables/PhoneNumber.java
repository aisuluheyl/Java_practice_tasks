package day02_variables;

public class PhoneNumber {

    public static void main(String[] args) {

        int countryCode;
        int areaCode;
        int localNumber;

        countryCode = 1;
        areaCode = 703;
        localNumber = 4512625;
//Phone number is: +1(703)-4512625
        System.out.println("+" + countryCode + "(" + areaCode + ")-" +localNumber);
    }


}
/*
1. Create a class named PhoneNumber and declare the following variables:
		countryCode
		areaCode
		localNumber

	Use string concatenation to display the phone number.

		Example:
			countryCode = 1;
		      areaCode = 703;
		      localNumber = 4512625;

		Output:
			Phone number is: +1(703)-4512625
 */