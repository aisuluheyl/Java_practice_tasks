package day14_oop_abstraction.car;

public class Nio extends Car implements AutoPilot, AutoPark{
    public Nio(String model, int year, double price, String color) {
        super("Nio", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " has auto-park function and you have to enable it in your settings.");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " " + getModel() + " has self-drive function, to activate it you need to switch to auto-pilot mode.");
    }

    @Override
    void start() {
        System.out.println("To start the " + getMake() + " " + getModel() + " push the start button.");
    }

    @Override
    void drive() {
        System.out.println(getMake() + " " + getModel() + " is driving faster than Toyota and Honda.");
    }
}
