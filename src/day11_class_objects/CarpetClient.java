package day11_class_objects;

public class CarpetClient {

    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(12,12,300, true);

        Carpet carpet2 = new Carpet(15,7,600, true);

        Carpet carpet3 = new Carpet(20,14,400, false);

        System.out.println(carpet1);
        System.out.println(carpet2);
        System.out.println(carpet3);

    }


}
