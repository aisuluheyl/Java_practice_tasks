package day03_operators;

public class Rectangle {

    public static void main(String[] args) {

        int length = 5,
                width = 6;

        int area = length * width;
        int perimeter = 2 * (length + width);

        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

    }
}
/*
1. Create a class named Rectangle with the following variables:
					length
					width

	Write a program that calculates the area and perimeter of the given rectangle.

					Example:
						length = 4.5
						width = 2

					Output:
						The area of the rectangle is 9.0
						The perimeter of the rectangle is 13.0

			Hint:
				Area of rectangle:
					area=length×width

				Perimeter of rectangle:
					perimeter=2×(length+width)
 */