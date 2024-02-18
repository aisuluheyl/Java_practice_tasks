package day13_oop_inheritance.state_task;

public class Florida extends State{

    public Florida(String politicalParty, String governor, String senator, int population) {
        super("FL", politicalParty, governor, senator, population);
    }


    public void crocodile(){
        System.out.println(getName() + " has lots of crocodiles and Universal Studios.");
    }

}
