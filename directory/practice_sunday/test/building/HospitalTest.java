package building;

import human.Patient;
import human.Physician;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HospitalTest {

    Hospital testHospital;
    Patient testPatient1;
    Patient testPatient2;
    Physician testPhysician1;
    Physician testPhysician2;

    @BeforeEach
    void init() {
        testHospital = new Hospital("Test Hospital", 5500,3);
        testPatient1 = new Patient("Test Patient1", 55);
        testPatient1 = new Patient("Test Patient2", 44);
        testPhysician1 = new Physician("Test Physician1", 60);
        testPhysician2 = new Physician("Test Physician2", 45);
    }

    @Test
    void test_addPatient() {
        testHospital.addPatient(testPatient1);
        assertEquals(1,testHospital.getPatients().size());
        testHospital.addPatient(testPatient2);
        assertEquals(2,testHospital.getPatients().size());
    }

    @Test
    void test_addPhysician() {
        testHospital.addPhysician(testPhysician1);
        assertEquals(1,testHospital.getPhysicians().size());
        testHospital.addPhysician(testPhysician2);
        assertEquals(2,testHospital.getPhysicians().size());
    }




}