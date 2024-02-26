package day13_oop_inheritance.employee_task;

public class Teacher extends Employee{

    public Teacher(String name, String lastName, String gender, int age, String employeeId, String jobTitle, String companyName, double salary) {
        super(name, lastName, gender, age, employeeId, jobTitle, companyName, salary);
    }

    public void work(){
        System.out.println(getName() + " " + getLastName() + " is teaching Maths.");
    }



}
