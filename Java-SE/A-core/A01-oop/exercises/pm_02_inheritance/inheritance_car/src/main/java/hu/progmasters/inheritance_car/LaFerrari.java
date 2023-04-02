package hu.progmasters.inheritance_car;

public class LaFerrari extends Car {

    //Note: that we extend our Car class and we specify most of its parameters in the constructor
    // Making it impossible to instantiate a LaFerrari object in any other way

    //Note-2: Creating a new LaFerrari also invokes the inherited constructor from
    // our Car class, setting numberOfWheels to 4, as a default!
    public LaFerrari() {
        setMakeYear("2020");
        this.setName("Ferrari LaFerrari 2016");
        this.setWeight(1585);
        this.setTopSpeed(349);
        this.setHorsepower(949);
    }

    //lehet this. nélkül is használni
}
