package day14_oop_abstraction.car;

public class Honda extends Car{

    public Honda(String model, int year, double price, String color) {
        super("Honda", model, year, price, color);
    }

    @Override
    void start() {
        System.out.println("To start the " + getMake() + " " + getModel() + " put the keys in the ignition and turn the key left.");
    }

    @Override
    void drive() {
        System.out.println(getMake() + " " + getModel() + " is very practical to drive around.");
    }
}
