package hu.progmasters.abstract_classes_car;

/**
 * When creating a new class, and extending our abstract class, we will notice
 * that the IDE will start complaining, because we need to implement a constructor.
 * The reason is because we have a parameterized one in our 'super' class.
 **/
public class Car extends Vehicle {

    /**
     * Note the difference between the two constructors.
     * In the first one, without parameters we don't have to define the two attributes
     * needed by our super constructor, because it is hardcoded in the initialization.
     * To make this more clean, we may move these properties to constant fields.
     * In the second, we still have the option to define these attributes ourselves.
     **/
    public Car() {
        super("N/A", "N/A");
    }

    public Car(String manufacturer, String model) {
        super(manufacturer, model);
    }

}
