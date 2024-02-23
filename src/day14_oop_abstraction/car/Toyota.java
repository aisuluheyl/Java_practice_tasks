package day14_oop_abstraction.car;

public class Toyota extends Car{

    public Toyota(String model, int year, double price, String color) {
        super("Toyota", model, year, price, color);
    }

    @Override
    void start() {
  System.out.println("To start the " + getMake() + " " + getModel() + " put the keys in the ignition and turn it right.");
    }

    @Override
    void drive() {
        System.out.println("To drive the " + getMake() + " " + getModel() + " you need to get the driver's license.");
    }
}
