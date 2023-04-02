package human;

public class Physician extends Human {
    public Physician(String name, int age) {
        super(name, age);
    }

    public void changeStatus(Patient patient) {
        patient.setHealthy(!patient.isHealthy());
    }
}
