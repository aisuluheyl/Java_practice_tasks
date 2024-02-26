package day13_oop_inheritance.employee_task;

public class Driver extends Employee{

    public Driver(String name, String lastName, String gender, int age, String employeeId, String jobTitle, String companyName, double salary) {

        super(name, lastName, gender, age, employeeId, jobTitle, companyName, salary);
    }

    public void work(){
        System.out.println(getName() + " " + getLastName() + " is driving.");
    }

}
