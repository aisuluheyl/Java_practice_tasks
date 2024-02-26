package day13_oop_inheritance.employee_task;

public class Developer extends Employee{
    public Developer(String name, String lastName, String gender, int age, String employeeId, String jobTitle, String companyName, double salary, String programmingLanguage) {
        super(name, lastName, gender, age, employeeId, jobTitle, companyName, salary);
        this.programmingLanguage = programmingLanguage;
    }

    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if(programmingLanguage == null || programmingLanguage.trim().isEmpty()){
            System.out.println("The programming language can not be empty");
        }
        this.programmingLanguage = programmingLanguage;
    }

    public void work(){
        System.out.println(getJobTitle() + " is coding in " +programmingLanguage + ".");
    }


}
