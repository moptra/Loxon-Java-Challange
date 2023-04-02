package building;

import human.Patient;
import human.Physician;

import java.util.ArrayList;
import java.util.List;

public class Hospital extends Building {

    private List<Patient> patients;
    private List<Physician> physicians;

    public Hospital(String name, int area, int numberOfFloors) {
        super(name, area, numberOfFloors);
        this.patients = new ArrayList<>();
        this.physicians = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addPhysician (Physician physician) {
        physicians.add(physician);
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public List<Physician> getPhysicians() {
        return physicians;
    }
}
