package day12_oop_encapsulation;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        //  boolean isSpecCharacter =
        if (name.isBlank() || name.isEmpty() || name == null) {
            System.err.println("Invalid entry, name can not be empty space");
            System.exit(1);
        }

        if (!name.matches("^[a-zA-Z\\s]+$")) {
            System.err.println("Name must contain only letters and spaces.");
            System.exit(1);
        }
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {

        if (unitPrice < 0) {
            System.err.println("Invalid entry, unit price should be positive number");
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {

        if (quantity < 0) {
            System.err.println("Invalid entry, quantity should be positive number");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public double calcCost() {
        return quantity * unitPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total cost=" + calcCost() +
                '}';
    }
}
/*
3. Create a custom class named Item with the following specifications:

	Attributes:
		name
		unitPrice
		quantity

	Ensure encapsulation for all fields.
		Conditions:
			The name cannot be empty or blank.
			The name cannot contain any special characters other than space.
			The name must start with letters.
			The unitPrice cannot be negative.
			The quantity cannot be negative.

	Add a constructor that enables the user to set all fields during object creation.

	Actions:
		calcCost(): Returns the total cost.
		toString(): Displays the name, unit price, quantity, and total cost calculated by calcCost() when the object is printed.

	Create another class named ItemClients, create multiple item objects, and test each function of the item object.

 */