package day14_oop_abstraction.car;

public class Audi extends Car implements AutoPark{
    public Audi(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {

    }

    @Override
    void start() {

    }

    @Override
    void drive() {

    }
}
