package hu.progmasters.pizza;

import java.util.List;

//Upon instantiating our custom pizza, it requires our developer to define the name,
// and the list of toppings on the pizza
public class CustomPizza extends Pizza {

    CustomPizza(String name, List<Topping> toppingList) {
        setName(name);
        setToppingList(toppingList);
    }

}
