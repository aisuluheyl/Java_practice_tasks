package day13_oop_inheritance.state_task;

public class StateClients {

    public static void main(String[] args) {

        Texas Houston = new Texas("Republican", "Greg Abbott", "Ted Cruz", 29_530_000);

        System.out.println(Houston);
        Houston.rodeo();

        System.out.println();

        Florida Miami = new Florida("Republican", "Ron DeSantis", "Marco Rubio", 22_610_726);

        System.out.println(Miami);
        Miami.crocodile();

        System.out.println();

        California LA = new California("Democratic", "Gavin Newsom", "Alex Padilla", 38_940_231);

        System.out.println(LA);
        LA.hollywood();

        System.out.println();

        Virginia Washington = new Virginia("Republican", "Greg Youngkin", "Mark Warner", 8_715_698);

        System.out.println(Washington);
        Washington.politicians();
    }

}
