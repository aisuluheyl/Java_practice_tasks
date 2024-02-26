package day13_oop_inheritance.employee_task;

public class Employee extends Person{

    private String employeeId, jobTitle, companyName;
    private double salary;

    public Employee(String name, String lastName, String gender, int age, String employeeId, String jobTitle, String companyName, double salary) {
        super(name, lastName, gender, age);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setCompanyName(companyName);
        setSalary(salary);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        if(employeeId == null || employeeId.trim().isEmpty()) {
            System.err.println("The employee's ID cannot be empty");
            System.exit(1);
        }
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle == null || jobTitle.trim().isEmpty()) {
            System.err.println("The job title cannot be empty");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if(companyName == null || companyName.trim().isEmpty()) {
            System.err.println("The company name cannot be empty");
            System.exit(1);
        }
        this.companyName = companyName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary <= 0) {
            System.err.println("The salary should be bigger than 0");
            System.exit(1);
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName() + " " + getLastName() + " is working as " + getJobTitle() + ".");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "name='" + getName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", age=" + getAge() +", employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
