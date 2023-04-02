package hu.progmasters.pizza;

import java.util.ArrayList;
import java.util.List;

//We have an abstract pizza class, it is abstract, because it is only a schema/template
//defining what attributes a pizza should have
//In our case: name, and a list of toppings
public abstract class Pizza {

    private String name;
    private List<Topping> toppingList = new ArrayList<>();

    //Our own method, to have a nice method to apply additional toppings
    public void addTopping(Topping topping) {
        this.toppingList.add(topping);
    }

    //Getters, setters...
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Topping> getToppingList() {
        return toppingList;
    }

    public void setToppingList(List<Topping> toppingList) {
        this.toppingList = toppingList;
    }

}
