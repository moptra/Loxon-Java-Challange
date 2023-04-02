package hu.progmasters.abstract_classes_car;

public class Boat extends Vehicle {

    public Boat(String manufacturer, String model) {
        super(manufacturer, model);
        this.setNumberOfWheels(0);
    }

    public void dropAnchor() {
        System.out.println("Anchor dropped...");
    }

}
