package day13_oop_inheritance.student_task;

public class UndergraduateStudent extends Student2{

    public UndergraduateStudent(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    public String study(){
        return getName() + " goes to " + getSchoolName() + " college.";
    }


}
