package day13_oop_inheritance.student_task;

public class CydeoStudent extends Student2{

    private int batchNumber;
    private int groupNumber;
    private String programmingLanguage;

    public CydeoStudent(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber <= 0){
            System.err.println("The batch number should be bigger than zero");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if(groupNumber <= 0){
            System.err.println("The group number should be bigger than zero");
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if(programmingLanguage == null || programmingLanguage.trim().isEmpty()) {
            System.err.println("The programming language cannot be empty");
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

    public String study(){
        return getName() + " is a happy student at " + getSchoolName() + ".";
    }

    @Override
    public String toString() {
        return getName() + " {" +
                "age ='" + getAge() + '\'' +
                ", gender ='" + getGender() + '\'' +
                ", student ID ='" + getStudentId() + '\'' +
                ", field of study='" + getFieldOfStudy() + '\'' +
                ", grade=" + getGrade() +
                ", school name='" + getSchoolName() + '\'' +"Cydeo Student{" +
                "batch number=" + batchNumber +
                ", group number=" + groupNumber +
                ", programming language='" + programmingLanguage + '\'' +
                '}';
    }
}
