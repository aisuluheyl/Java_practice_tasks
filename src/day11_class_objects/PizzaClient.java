package day11_class_objects;

public class PizzaClient {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("small", 2, 2 );

        Pizza pizza2 = new Pizza("medium", 5, 5 );

        Pizza pizza3 = new Pizza("large", 2, 3 );

        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
    }
}
