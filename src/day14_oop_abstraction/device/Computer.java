package day14_oop_abstraction.device;

public class Computer extends Device{

    public Computer(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    void turnOn() {
        System.out.println("To turn on the " +  getBrand() + " " + getModel() + " push the green button");
    }

    @Override
    void turnOff() {
        System.out.println("To turn off the " +  getBrand() + " " + getModel() + " push the red button");
    }

    public void download(){
        System.out.println("The" +  getBrand() + " " + getModel() + " downloading the game and movies");
    }

}
