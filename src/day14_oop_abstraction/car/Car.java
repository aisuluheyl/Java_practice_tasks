package day14_oop_abstraction.car;

public abstract class Car {

    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {

        if(make == null || make.isEmpty()){
            terminate("The make is invalid");
        }
        this.make = make;

        if(model == null || model.isEmpty()){
            terminate("The model is invalid");
        }
        this.model = model;

        if(year <= 1886){
            terminate("The year is invalid");
        }
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public void terminate(String message){
        System.err.println(message);
        System.exit(1);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <=0 ){
            terminate("The price should be bigger than zero");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color == null || color.isEmpty()){
            terminate("The color is invalid");
        }
        this.color = color;
    }

    abstract void start();
    abstract  void drive();

    public void stop(){
        System.out.println(getMake() + " " + getModel() + " is stopping");
    }

    @Override
    public String toString() {
        return "Car {" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}




