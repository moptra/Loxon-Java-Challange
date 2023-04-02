package human;

public abstract class Human {

    protected String name;
    protected int age;
    protected static final String SEPARATOR = System.lineSeparator();

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
