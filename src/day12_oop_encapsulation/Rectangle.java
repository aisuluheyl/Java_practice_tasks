package day12_oop_encapsulation;

public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        if (width <= 0) {
            System.err.println("Invalid");
        }
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            System.err.println("Invalid entry, width can not be negative or zero");
            System.exit(1);
        }
        this.width = width;
    }

    public double getLength() {
        if (length <= 0) {
            System.err.println("Invalid");
        }
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            System.err.println("Invalid entry, length can not be negative or zero");
            System.exit(1);
            this.length = length;
        }
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }

    public double calcArea(){
        return length * width;
    }

    public double calcPerimeter(){
        return (length + width) * 2;
    }


}
/*
2. Create a custom class named Rectangle with the following specifications:

	Attributes:
		width
		length

	Ensure encapsulation for both fields.
		Conditions:
			The width and length cannot be set to negative or zero values.

	Add a constructor that allows the user to set both fields during object creation.

	Actions:
		calcArea(): Calculates and returns the area of the rectangle object.
		calcPerimeter(): Calculates and returns the perimeter of the rectangle object.
		toString(): Displays the width, length, area, and perimeter of the rectangle when the object is printed.

	Create another class named RectangleClients, create multiple rectangle objects, and test each function of the rectangle object.

 */