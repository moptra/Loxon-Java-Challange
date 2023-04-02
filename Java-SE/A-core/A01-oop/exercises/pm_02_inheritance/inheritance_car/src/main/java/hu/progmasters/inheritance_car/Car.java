package hu.progmasters.inheritance_car;

public class Car extends Vehicle {

    //We add some additional fields to our Car class
    private String makeYear;
    private int horsepower;

    public Car() {
        //super();
        //Note the you can reach the inherited methods from Vehicle class
        setNumberOfWheels(4);
    }

    // a szülőnek nincs nevesített konstruktora, ezért nem kell hívni a gyerek konstruktorában a super classt

    public String getMakeYear() {
        return makeYear;
    }

    public void setMakeYear(String makeYear) {
        this.makeYear = makeYear;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

}
