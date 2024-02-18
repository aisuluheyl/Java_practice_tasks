package day13_oop_inheritance.state_task;

public class California extends State{
    public California(String politicalParty, String governor, String senator, int population) {
        super("CA", politicalParty, governor, senator, population);
    }

    public void hollywood(){
        System.out.println(getName() + " has Hollywood and lots of celebrities living there.");
    }
}
