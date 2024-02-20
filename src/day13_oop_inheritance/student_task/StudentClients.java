package day13_oop_inheritance.student_task;

public class StudentClients {

    public static void main(String[] args) {

        GraduateStudent graduateStudent1 = new GraduateStudent("Farzana", 32, "female", "FA32", "Saleforce", 'A', "Soft Innovas");

        System.out.println(graduateStudent1);

        System.out.println(graduateStudent1.study());

        System.out.println("-----------------------------------------------");

        UndergraduateStudent undergraduateStudent1 = new UndergraduateStudent("Aisulu", 32, "female", "AR24", "Software Engineering Automation", 'A', "Cydeo");

        System.out.println(undergraduateStudent1);

        System.out.println(undergraduateStudent1.study());

        System.out.println("-----------------------------------------------");

        CydeoStudent cydeoStudent1 = new CydeoStudent("Windia", 25, "female", "WW23", "Java SDET", 'A', "Cydeo International", 33, 4,"Java");

        System.out.println(cydeoStudent1);
        System.out.println(cydeoStudent1.study());

    }
}
