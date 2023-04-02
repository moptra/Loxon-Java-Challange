package hu.progmasters.customer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void setCostumerInfo_NegativeLong_ShouldReturnZero() {
        Customer testCustomer = new Customer(0,null,null, null,null);
        testCustomer.setId(-3);
        long expected = 0;
        long result = testCustomer.getId();
        assertEquals(expected,result);

    }
    @Test
    void setCostumerInfo_PositiveLong_ShouldReturnTheLong() {
        Customer testCustomer = new Customer(0,null,null, null,null);
        testCustomer.setId(123456789);
        long expected = 123456789;
        long result = testCustomer.getId();
        assertEquals(expected,result);
    }
    @Test
    void setHouseNumber_PositiveInt_ShouldReturnTheInt() {
        Address testAddress = new Address(null,null,23);
        int expected = 23;
        int result = testAddress.getHouseNumber();
        assertEquals(expected,result);
    }
    @Test
    void setHouseNumber_NegativeInt_ShouldReturnTheInt() {
        Address testAddress = new Address(null,null,-42);
        int expected = 0;
        int result = testAddress.getHouseNumber();
        assertEquals(expected,result);
    }


}