package hu.progmasters.pizza;

//We define our custom pizza
// We extend our Pizza class template to inherit all attributes
// Then we pre-define all properties, in the constructor
public class Capricciosa extends Pizza {

    Capricciosa() {
        this.setName("Capricciosa");
        this.addTopping(Topping.HAM);
        this.addTopping(Topping.MUSHROOM);
        this.addTopping(Topping.CHEESE);
    }

}
