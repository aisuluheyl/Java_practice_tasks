package day13_oop_inheritance.phone_task;

public class PhoneClients {

    public static void main(String[] args) {

        IPhone iphone1 = new IPhone( "13", "Pro",1099, "Midnight Green");

        System.out.println();
        System.out.println(iphone1);
        System.out.println();

        iphone1.call("346-234-3010");
        iphone1.text("713-884-0106");

        System.out.println();

        IPhone iphone2 = new IPhone( "14", "Max", 1199, "Silver");

        System.out.println(iphone2);
        System.out.println();

        iphone2.call("832-832-8832");
        iphone2.text("713-713-7133");

        System.out.println("-----------------------------------------------------------------------");

        Samsung samsung1 = new Samsung( "Galaxy S24", "Regular", 1299, "Black");

        System.out.println();
        System.out.println(samsung1);
        System.out.println();

        samsung1.call("718-718-7188");
        samsung1.text("713-418-67156");

        System.out.println();

        Samsung samsung2 = new Samsung( "Galaxy S22", "Large", 1199, "White");

        System.out.println(samsung2);
        System.out.println();

        samsung2.call("929-528-6655");
        samsung2.text("548-754-6632");

        System.out.println("------------------------------------------------------------");

        Nokia nokia1 = new Nokia( "N93", "Standard", 199, "Navy");

        System.out.println(nokia1);
        System.out.println();

        nokia1.call("617-876-0099");
        nokia1.text("987-098-4567");

        System.out.println();

        Nokia nokia2 = new Nokia( "6410", "Small", 245, "Charcoal");

        System.out.println(nokia2);
        System.out.println();

        nokia2.call("347-765-8847");
        nokia2.text("503-765-0956");
    }
}
