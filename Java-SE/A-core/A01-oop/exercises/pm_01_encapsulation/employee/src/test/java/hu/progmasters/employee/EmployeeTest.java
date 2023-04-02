package hu.progmasters.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void test_setMonthlySalary_negativeNumber_shouldReturnZero() {
        Employee testEmployee = new Employee("Ádám", "Szűts", 10.5);
        double expected = 0.0;
        testEmployee.setMonthlySalary(-20);
        double result = testEmployee.getMonthlySalary();
        assertEquals(expected, result);
    }

    @Test
    void test_setMonthlySalary_positiveNumber_shouldReturnTheNumber() {
        Employee testEmployee = new Employee("Ádám", "Szűts", 10.5);
        testEmployee.setMonthlySalary(20.5);
        double expected = 20.5;
        double result = testEmployee.getMonthlySalary();
        assertEquals(expected, result);
    }

}