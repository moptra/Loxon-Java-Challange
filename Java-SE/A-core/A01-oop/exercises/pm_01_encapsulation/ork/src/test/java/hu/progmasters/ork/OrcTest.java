package hu.progmasters.ork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrcTest {

    @Test
    void test_setNumberOfKills_negativeNumber_shouldReturnZero() {
        Orc testOrc = new Orc("Béla");
        int expected = 0;
        testOrc.setNumberOfKills(-23);
        int result = testOrc.getNumberOfKills();
        assertEquals(expected,result);
    }
    @Test
    void test_setNumberOfKills_positiveNumber_shouldReturnThePositiveNumber() {
        Orc testOrc = new Orc("Béla");
        int expected = 87;
        testOrc.setNumberOfKills(87);
        int result = testOrc.getNumberOfKills();
        assertEquals(expected,result);
    }

}