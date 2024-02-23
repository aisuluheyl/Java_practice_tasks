package day14_oop_abstraction.car;

public class Tesla extends Car implements AutoPark, AutoPilot{
    public Tesla(String model, int year, double price, String color) {
        super("Tesla", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " has auto-park function enabled automatically.");
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
        System.out.println(getMake() + " " + getModel() + " is driving fast, smooth and very quietly.");
    }
}
