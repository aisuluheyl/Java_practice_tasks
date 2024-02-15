package day12_oop_encapsulation;

public class CandyClients {
    public static void main(String[] args) {


        Candy candy1 = new Candy("Hersheys", 4, 4.99, true);
        Candy candy2 = new Candy("Waffers", 2, 0, false);

        Candy candy3 = new Candy("Haribo", 10, 5.5, false);

        System.out.println("candy1 = " + candy1);
        System.out.println("candy2 = " + candy2);
        System.out.println("candy3 = " + candy3);

    }
}
