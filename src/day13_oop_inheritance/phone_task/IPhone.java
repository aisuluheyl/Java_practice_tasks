package day13_oop_inheritance.phone_task;

public class IPhone extends Phone{

    public IPhone(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }

    public void faceTime(double phoneNumber){
        System.out.println("facetiming with the number " + phoneNumber);
    }







}
