package day13_oop_inheritance.state_task;

public class Texas extends State{
    public Texas(String politicalParty, String governor, String senator, int population) {
        super("TX", politicalParty, governor, senator, population);
    }

    public void rodeo(){
        System.out.println(getName() + " has Rodeo every year and is my home state. Texas one love <3");
    }
}
