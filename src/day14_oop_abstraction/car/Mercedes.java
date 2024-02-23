package day14_oop_abstraction.car;

public class Mercedes extends Car implements AutoPark{
    public Mercedes(String model, int year, double price, String color) {
        super("Mercedes", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("To activate the auto-park function in your " + getMake() + " " + getModel() + " push the auto-park button.");
    }

    @Override
    void start() {
        System.out.println("To start the " + getMake() + " " + getModel() + " push the start button.");
    }

    @Override
    void drive() {
        System.out.println(getMake() + " " + getModel() + " driving through the city.");
    }
}
