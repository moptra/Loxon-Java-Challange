package hu.progmasters.desk;

public class Computer {

    public String brandName;
    public boolean isComputerOn;

    public Computer(String brandName, boolean isComputerOn) {
        this.brandName = brandName;
        this.isComputerOn = isComputerOn;
    }

    public void turnComputerOn() {
        isComputerOn = true;
    }

    public void turnComputerOff() {
        isComputerOn = false;
    }

    public String toString () {
        if (isComputerOn == true) {
            return "The computer is on and it's brand is " + brandName + ".";
        } else {
            return "The computer is off and it's brand is " + brandName + ".";
        }
    }

}
