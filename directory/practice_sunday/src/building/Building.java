package building;

public abstract class Building {
    private String name;
    private int area;
    private int numberOfFloors;

    public Building(String name, int area, int numberOfFloors) {
        this.name = name;
        this.area = area;
        this.numberOfFloors = numberOfFloors;
    }
}
