package hu.progmasters.ork;


public class Main {

    //Check the implementation of our Orc class, then try
    // calling some of it's methods
    public static void main(String[] args) {

        Orc orc = new Orc("Uzreg");
        orc.setHordeName("Uruh-Hai");

        //Use the debugger to see what happens, when you try to set a negative value
        orc.setNumberOfKills(-1);

        orc.setNumberOfKills(20);
    }
}
