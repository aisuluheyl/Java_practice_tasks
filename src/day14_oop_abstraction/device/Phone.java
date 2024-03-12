package day14_oop_abstraction.device;

public class Phone extends Device {

    public Phone(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    void turnOn() {
        System.out.println("To turn on the " + getBrand() + " " + getModel() + " you need to push the power button once.");
    }

    @Override
    void turnOff() {
        System.out.println("To turn off the " + getBrand() + " " + getModel() + " you need to push the power button twice.");
    }

    public void call(long phoneNum) {
        System.out.println("You can use the " + getBrand() + " " + getModel() + " to call any user in the US.");
    }

    public void text(long phoneNum) {
        System.out.println("You can use the " + getBrand() + " " + getModel() + " to text any user in the US and you get 3000 free text messages.");
    }


}
