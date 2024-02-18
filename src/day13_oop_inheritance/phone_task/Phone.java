package day13_oop_inheritance.phone_task;

public class Phone {
    
    private String brand;
    private String model;
    private String size;
    private double price;
    private String color;

    public String getBrand() {
        return brand;
    }

    public Phone(String brand, String model, String size, double price, String color) {
        setBrand(getClass().getSimpleName());
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    public void setBrand(String brand) {
        if(brand == null || brand.isBlank() || brand.isEmpty()){
            System.err.println("The brand can not be blank");
            System.exit(1);
        }

        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model == null || model.isBlank() || model.isEmpty()){
            System.err.println("The model can not be blank");
            System.exit(1);
        }
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0){
            System.err.println("The price can not be negative number");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        if(color == null || color.isBlank() || color.isEmpty()){
            System.err.println("The color can not be blank");
            System.exit(1);
        }
        this.color = color;
    }

    public void call(String phoneNumber){
        System.out.println(brand + " " + model + " calling the number " + phoneNumber);
    }

    public void text(String phoneNumber){
        System.out.println(brand + " " + model + " texting to the number " + phoneNumber);
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() +" {" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }


}

/*
1. Create a custom class named 'IPhone' with these specifications:
   Attributes:
       - brand: String
       - model: String
       - size: String
       - price: double
       - color: String

   Encapsulation:
       - All fields must be private with getters and setters.
       Conditions for Encapsulation:
           - The 'brand', 'model', and 'color' must not be null, empty, or blank.
           - The 'price' must be greater than zero.

   Constructor:
       - Add a constructor to initialize all fields.

   Actions:
       - call(phoneNumber): Display "calling the number [phoneNumber]".
       - text(phoneNumber): Display "texting to the number [phoneNumber]".
       - faceTime(phoneNumber): Display "facetiming with the number [phoneNumber]".
       - toString(): Prints the information of the IPhone object.

 */