package hu.progmasters.evencounter;

public class EvenCounter {

    public static int count(int input) {
        int counter = 0;
        if (input <= 0) {
            return -1;
        } else {
            while (input > 0) {
                int digit = input % 10;
                if (input % 2 == 0) {
                    counter++;
                }
                input /= 10;
            }
        }
    return counter;

    }
}
