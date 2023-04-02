package hu.progmasters.fizzbuzz;

import  static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz_withThree_shouldReturnFizz() {
        String result = FizzBuzz.fizzBuzz(3);
        String expected = "fizz";

        assertEquals(expected, result);
    }
    @Test
    public void testFizzBuzz_withTwo_shouldReturnTheNumber() {
        String result = FizzBuzz.fizzBuzz(2);
        String expected = "2";

        assertEquals(expected, result);
    }
    @Test
    public void testFizzBuzz_withFive_shouldReturnBuzz() {
        String result = FizzBuzz.fizzBuzz(5);
        String expected = "buzz";

        assertEquals(expected, result);
    }
    @Test
    public void testFizzBuzz_withFifteen_shouldReturnFizzbuzz() {
        String result = FizzBuzz.fizzBuzz(15);
        String expected = "fizzbuzz";

        assertEquals(expected, result);
    }
    @Test
    public void testFizzBuzz_withNegative_shouldReturnTheNumber() {
        String result = FizzBuzz.fizzBuzz(-15);
        String expected = "-15";

        assertEquals(expected, result);
    }
    @Test
    public void testFizzBuzz_withZero_shouldReturnTheNumber() {
        String result = FizzBuzz.fizzBuzz(0);
        String expected = "0";

        assertEquals(expected, result);
    }
    @Test
    public void testFizzBuzz_withSeventeen_shouldReturnTheNumber() {
        String result = FizzBuzz.fizzBuzz(17);
        String expected = "17";

        assertEquals(expected, result);
    }
}