package day12_oop_encapsulation;

public class ItemClients {

    public static void main(String[] args) {

        Item book = new Item("Harry Potter", 19.99, 3);

        Item cream = new Item("Moisturizing face cream", 35.99, 1);

        Item pillow = new Item("Shoulder pillow", 22.49, 5);

        System.out.println(book);
        System.out.println(cream);
        System.out.println(pillow);

    }
}
