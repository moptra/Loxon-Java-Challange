package hu.progmasters.abstract_classes_car;

/**
 * Usually the main reason behind using an abstract class is,
 * to prevent the developer from instantiating it.
 * By defining abstract classes we can design a general pattern
 * for an object model, declaring all common properties/behaviours.
 */
public abstract class Vehicle {

    private String manufacturer;
    private String model;
    private int yearOfProduction;
    private int numberOfWheels;
    private int topSpeed;
    private int weight;

    /**
     * Since we cannot instantiate a Vehicle class, defining a parameterized
     * constructor seems useless. However, by doing so, we can guarantee, that whoever
     * extends our Vehicle class, MUST define the Vehicles manufacturer and model.
     * Making sure, such object cannot exist, without having these properties defined.
     */
    public Vehicle(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    /**
     * Getters and setters
     */
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
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

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", numberOfWheels=" + numberOfWheels +
                ", topSpeed=" + topSpeed +
                ", weight=" + weight +
                '}';
    }
}
