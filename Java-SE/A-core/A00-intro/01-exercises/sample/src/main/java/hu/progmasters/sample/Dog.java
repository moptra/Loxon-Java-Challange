package hu.progmasters.sample;

public class Dog {

    String name;
    int age;
    boolean isHungry;

    public Dog(String name, int age, boolean isHungry) {
        this.name = name;
        this.age = age;
        this.isHungry = isHungry;
    }

    public void canEat() {
        System.out.println("Nyamm-nyamm");
    }
}
