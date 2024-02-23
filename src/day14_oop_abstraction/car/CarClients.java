package day14_oop_abstraction.car;

public class CarClients {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", 2023, 27999, "Dark Cherry");

        System.out.println(toyota);
        toyota.start();
        toyota.drive();

        System.out.println("--------------------------------------------");

        Honda honda = new Honda("Civic", 2022, 32450, "Silver sky");

        System.out.println(honda);
        honda.start();
        honda.drive();

        System.out.println("--------------------------------------------");

        Mercedes mercedes = new Mercedes("GLB", 2021, 49500, "Black night");

        System.out.println(mercedes);
        mercedes.start();
        mercedes.drive();

        System.out.println("--------------------------------------------");

        Nio nio = new Nio("ET7", 2023, 56700, "White");

        System.out.println(nio);
        nio.start();
        nio.drive();
        nio.autoPark();
        nio.selfDrive();

        System.out.println("--------------------------------------------");

        Tesla tesla = new Tesla("Cybertruck", 2024, 105000, "Peach pink");

        System.out.println(tesla);
        tesla.start();
        tesla.drive();
        tesla.autoPark();
        tesla.selfDrive();

        System.out.println("--------------------------------------------");

        CydeoCar cydeoCar = new CydeoCar("Batch-33", 2024, 200000, "Multicolor");

        System.out.println(cydeoCar);
        cydeoCar.start();
        cydeoCar.drive();
        cydeoCar.autoPark();
        cydeoCar.selfDrive();
        cydeoCar.fly();



    }
}
