package day13_oop_inheritance.state_task;

public class Virginia extends State{
    public Virginia(String politicalParty, String governor, String senator, int population) {
        super("VA", politicalParty, governor, senator, population);
    }

    public void politicians(){
        System.out.println(getName() + " has lots of politicians residing there and home of CYDEO school.");
    }
}
