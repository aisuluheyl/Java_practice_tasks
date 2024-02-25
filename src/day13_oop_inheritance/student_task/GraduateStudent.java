package day13_oop_inheritance.student_task;

public class GraduateStudent extends Student2{


    public GraduateStudent(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    public String study(){
        return getName() + " is a graduate student at " + getSchoolName() + ".";
    }
}
