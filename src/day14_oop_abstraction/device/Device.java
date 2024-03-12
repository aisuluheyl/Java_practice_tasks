package day14_oop_abstraction.device;

public abstract class Device {

    private final String brand, model, size;
    private double price;
    private String color;
    private boolean hasBattery, hasPowerButton;

    public Device(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {

        if (brand == null || brand.trim().isEmpty()) {
            terminate("The brand can not be empty");
        }
        this.brand = brand;

        if (model == null || model.trim().isEmpty()) {
            terminate("The model can not be empty");
        }
        this.model = model;

        if (size == null || size.trim().isEmpty()) {
            terminate("The size can not be empty");
        }

        this.size = size;

        setPrice(price);
        setColor(color);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            terminate("The price can not be negative or 0");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color == null || color.trim().isEmpty()){
            terminate("The color can not be empty");
        }
        this.color = color;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public void terminate(String message) {
        System.err.println(message);
        System.exit(1);
    }

    abstract void turnOn();
    abstract void turnOff();

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
