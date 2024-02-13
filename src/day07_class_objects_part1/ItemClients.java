package day07_class_objects_part1;

public class ItemClients {

    public static void main(String[] args) {

        Item item1 = new Item();

        item1.itemName = "Laptop";
        item1.unitPrice = 750;
        item1.quantity = 2;

       double totalPrice = item1.calcCost(750,2);

        System.out.println(item1);

        System.out.println(totalPrice);

        System.out.println("-------------------------------------------");

        Item item2 = new Item();

        item2.itemName = "Valentines' card";
        item2.unitPrice = 3.5;
        item2.quantity = 40;

        double totalPrice2 = item1.calcCost(3.5,40);

        System.out.println(item2);

        System.out.println(totalPrice2);

        System.out.println("-------------------------------------------");

        Item item3 = new Item();

        item3.itemName = "Boardgames";
        item3.unitPrice = 29.99;
        item3.quantity = 3;

        double totalPrice3 = item1.calcCost(2.99,3);

        System.out.println(item3);

        System.out.println(totalPrice3);

        System.out.println("-------------------------------------------");

    }
}
