package hu.progmasters.inheritance_car;

/* We define a few general attributes for our vehicle class, all of these (including the methods)
 * will be inherited by our extending classes*/
public class Vehicle {

    private String name;
    private int topSpeed;
    private int weight;
    private int numberOfWheels;

    public String getName() {return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
