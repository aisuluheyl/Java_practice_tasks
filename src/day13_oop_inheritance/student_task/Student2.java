package day13_oop_inheritance.student_task;

public class Student2 extends Student{

    public Student2(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    private String studentId;
    private String fieldOfStudy;
    private char grade;
    private String schoolName;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if(studentId == null || studentId.trim().isEmpty()) {
            System.err.println("The student ID cannot be empty");
            System.exit(1);
        }
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if(fieldOfStudy == null || fieldOfStudy.trim().isEmpty()) {
            System.err.println("The field of study cannot be empty");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if(schoolName == null || schoolName.trim().isEmpty()) {
            System.err.println("The school name cannot be empty");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }

    public String study(){
        return getName() + " goes to " + getSchoolName();
    }

    @Override
    public String toString() {
        return getName() + " {" +
                "age ='" + getAge() + '\'' +
                ", gender ='" + getGender() + '\'' +
                ", student ID ='" + studentId + '\'' +
                ", field of study='" + fieldOfStudy + '\'' +
                ", grade=" + grade +
                ", school name='" + schoolName + '\'' +
                '}';
    }
}
