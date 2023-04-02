package hu.progmasters.desk;

public class Desk {
    private Drawer leftDrawer;
    private Drawer rightDrawer;
    private Radio radio;
    private Computer computer;
    private Photograph photograph;

    public Desk(Drawer leftDrawer, Drawer rightDrawer, Radio radio, Computer computer, Photograph photograph) {
        this.leftDrawer = leftDrawer;
        this.rightDrawer = rightDrawer;
        this.radio = radio;
        this.computer = computer;
        this.photograph = photograph;
    }

    public Desk() {
        this.leftDrawer = leftDrawer;
        this.rightDrawer = rightDrawer;
        this.radio = radio;
        this.computer = computer;
        this.photograph = photograph;
    }

    public void tidyUp() {
        leftDrawer.setDrawerOpen(false);
        rightDrawer.setDrawerOpen(false);
        computer.turnComputerOff();
        radio.turnRadioOff();
    }

    public String toString() {
        return "The left " + leftDrawer.toString() + "\n" + "The right " + rightDrawer.toString() + "\n" + radio.toString() + "\n"
                + computer.toString() + "\n" + photograph.toString();

    }

}
