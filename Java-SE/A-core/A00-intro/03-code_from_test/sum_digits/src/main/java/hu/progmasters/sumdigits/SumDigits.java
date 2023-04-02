package hu.progmasters.sumdigits;

public class SumDigits {

    public static int sumDigits(int number) {
        int sumOfDigits = 0;

        while (number > 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            number = number / 10;
        }
        return sumOfDigits;
    }
}
