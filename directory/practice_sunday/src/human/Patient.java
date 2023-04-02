package human;

public class Patient extends Human implements CanPrintDetails {

    private boolean isHealthy;

    public Patient(String name, int age) {
        super(name, age);
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    @Override
    public void printDetails() {
        String isHealthy;
        if (!this.isHealthy) {
            isHealthy = " is not healthy.";
        } else {
            isHealthy = " is healthy.";
        }
        System.out.print("Name: " + name + SEPARATOR +
                "Age: " + age + SEPARATOR +
                name + isHealthy);
    }
}
