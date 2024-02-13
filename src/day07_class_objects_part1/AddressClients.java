package day07_class_objects_part1;

public class AddressClients {

    public static void main(String[] args) {

        Address address1 = new Address();

        address1.buildingNumber = 14231;
        address1.street = "FM 1464";
        address1.city = "Sugar Land";
        address1.state = "TX";
        address1.zipCode = "77498";

        System.out.println(address1);

        System.out.println("------------------------------------------");

        Address address2 = new Address();

        address2.buildingNumber = 3000;
        address2.street = "Woodland Park Drive";
        address2.city = "Houston";
        address2.state = "TX";
        address2.zipCode = "77082";

        System.out.println(address2);


    }
}
