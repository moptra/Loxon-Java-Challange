package human;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhysicianTest {

    @Test
    void test_changeStatus() {
        Patient testPatient = new Patient("Test Patient", 44);
        Physician testPhysician = new Physician("Test Physician", 45);
        testPhysician.changeStatus(testPatient);
        assertEquals(true, testPatient.isHealthy());
        testPhysician.changeStatus(testPatient);
        assertEquals(false, testPatient.isHealthy());
    }
}