package day12_oop_encapsulation;

public class Candy {

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        if(brand == null || brand.isEmpty() || brand.isBlank()){
            System.err.println("Please enter brand name, can not be empty");
            System.exit(1);
        }
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity <= 0){
            System.err.println("Quantity can not be equal zero or negative");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        String result = "Free";
        return price;
        }

    public void setPrice(double price) {
        if(price < 0){
            System.err.println("The price can not be negative");
            System.exit(1);
        }
        if(price == 0) {
            System.out.println("Free");
        }
        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }


    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + ((price == 0) ?"free" : price) +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}


/*
4. Create a custom class named Candy with the following specifications:

	Attributes:
		brand
		quantity
		price
		hasPeanuts

	Ensure encapsulation for all fields.
		Conditions:
			The price of candy cannot be set to a negative value.
			The quantity of candy cannot be set to zero or a negative value.

	Add a constructor that allows the user to set all fields during object creation.

	Actions:
		toString(): Displays the brand, unit price, and quantity when the object is printed. If the price is zero, display "free" instead of 0.

	Create another class named CandyClients, create multiple candy objects, and test each function of the candy object.

 */