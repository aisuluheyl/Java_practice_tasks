package day14_oop_abstraction.car;

public class CydeoCar extends Car implements AutoPilot, AutoPark, Flyable {
    public CydeoCar(String model, int year, double price, String color) {
        super("Cydeo car", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " can auto-park anywhere, reverse and parallel parking are available too.");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " " + getModel() + "has the best option for self-drive up to 24 hrs a trip." );
    }

    @Override
    void start() {
        System.out.println("To start " + getMake() + " " + getModel() + " you need to give voice command for the vehicle to start.");
    }

    @Override
    void drive() {
        System.out.println("Driving " + getMake() + " " + getModel() + " is the heavenly experience.");
    }

    @Override
    public void fly() {
        System.out.println("Flying option is available for " + getMake() + " " + getModel() + ", once you subscribe for annual flying training.");
    }
}
