package day07_class_objects_part1;

public class RectangleClients {

    public static void main(String[] args) {

        System.out.println("------------------------------------------");

        Rectangle rectangle1 = new Rectangle();
        rectangle1.length = 10;
        rectangle1.width = 20;

        System.out.println(rectangle1);

        System.out.println("------------------------------------------");

        double area1 = rectangle1.calculateArea(10,20);

        System.out.println("area1 = " + area1);

        System.out.println("------------------------------------------");

        double perimeter1 = rectangle1.calculatePerimeter(10,20);

        System.out.println("perimeter1 = " + perimeter1);

        System.out.println("------------------------------------------");

        Rectangle rectangle2 = new Rectangle();
        rectangle2.length = 5;
        rectangle2.width = 12;

        System.out.println(rectangle2);

        System.out.println("------------------------------------------");

        double area2 = rectangle2.calculateArea(5,12);

        System.out.println("area2 = " + area2);

        System.out.println("------------------------------------------");

        double perimeter2 = rectangle2.calculatePerimeter(5,12);

        System.out.println("perimeter2 = " + perimeter2);

        System.out.println("------------------------------------------");
    }
}
