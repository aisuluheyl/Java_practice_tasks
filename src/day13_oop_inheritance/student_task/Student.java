package day13_oop_inheritance.student_task;

public class Student {

    private String name;
    private int age;
    private String gender;

    public Student(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()) {
            System.err.println("The name cannot be empty");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0){
            System.err.println("The age should be bigger than zero");
            System.exit(1);
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if(gender == null || gender.trim().isEmpty()) {
            System.err.println("The gender cannot be empty");
            System.exit(1);
        }

        if(!(gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("male"))){
            System.err.println("Invalid entry, gender should be male or female");
            System.exit(1);
        }
        this.gender = gender;
    }

    @Override
    public String toString() {
        return getName() + " {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
