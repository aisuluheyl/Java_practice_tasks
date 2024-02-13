package day07_class_objects_part1;

public class EmployeeClients {

    public static void main(String[] args) {

        System.out.println("------------------------------------------");

        Employee employee1 = new Employee();
        employee1.name = "Aisulu";
        employee1.age = 32;
        employee1.gender = 'F';
        employee1.jobTitle = "Java SDET";
        employee1.salary = 125000;

        System.out.println(employee1);

        employee1.work();

        System.out.println("------------------------------------------");

        Employee employee2 = new Employee();
        employee2.name = "Laura";
        employee2.age = 33;
        employee2.gender = 'F';
        employee2.jobTitle = "CEO of Kore";
        employee2.salary = 225000;

        System.out.println(employee2);

        employee2.work();

        System.out.println("------------------------------------------");

        Employee employee3 = new Employee();
        employee3.name = "Artyk";
        employee3.age = 55;
        employee3.gender = 'F';
        employee3.jobTitle = "HR Manager";
        employee3.salary = 95000;

        System.out.println(employee3);

        employee3.work();


    }
}
