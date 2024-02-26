package day13_oop_inheritance.employee_task;

public class EmployeeClients {

    public static void main(String[] args) {

        Tester tester = new Tester("Aisulu", "Rysbekova", "female", 32, "AR2024", "Java SDET", "Facebook", 115000);

        System.out.println(tester);
        tester.work();

        System.out.println("---------------------------------------------");

        Developer developer = new Developer("Nazerke", "Omar", "female", 32, "NO2023", "Full-stack developer", "Amazon", 175000, "Java and Python");

        System.out.println(developer);
        developer.work();

        System.out.println("---------------------------------------------");

        Teacher teacher = new Teacher("Akerke", "Jezovksaya", "female", 33, "AJ2020", "Applied Maths teacher","Harmony School", 65000);

        System.out.println(teacher);
        teacher.work();

        System.out.println("---------------------------------------------");

        Driver driver = new Driver("Michael", "Schumaher", "male", 37, "MS2004", "Formula-1 Driver", "Michellin", 1200000);

        System.out.println(driver);
        driver.work();
    }
}
