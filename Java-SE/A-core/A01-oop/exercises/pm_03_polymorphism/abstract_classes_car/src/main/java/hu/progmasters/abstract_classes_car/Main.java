package hu.progmasters.abstract_classes_car;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
         * Notice the following line of code won't compile
         */
        // new Vehicle("", "");

        //Creating a new car, without parameters will set
        // manufacturer and model to the default values
        Car carWithDefaultValues = new Car();
        System.out.println("Car default manufacturer: " + carWithDefaultValues.getManufacturer());
        System.out.println("Car default model: " + carWithDefaultValues.getModel());

        //Creating a new car, with parameters will set
        // manufacturer and model to the desired values
        Car customCar = new Car("Ford", "Focus ST");
        System.out.println("Car manufacturer: " + customCar.getManufacturer());
        System.out.println("Car model: " + customCar.getModel());

        Boat boat = new Boat("Abati Yachts", "60 Keyport");

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(carWithDefaultValues);
        vehicles.add(customCar);
        vehicles.add(boat);

        System.out.println("-----------------------------------------------");
        System.out.println("List of vehicles:");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
            System.out.println("------");
        }
    }
}
