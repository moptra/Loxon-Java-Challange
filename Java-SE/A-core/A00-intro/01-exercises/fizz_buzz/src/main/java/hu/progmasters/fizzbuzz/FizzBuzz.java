package hu.progmasters.fizzbuzz;

public class FizzBuzz {

/*    public static void main(String[] args) {
        System.out.println(fizzBuzz(17));
    }*/

    static String fizzBuzz(int number) {
        if (number > 0) {
            if (number % 15 == 0) {
                return "fizzbuzz";
            } else if (number % 3 == 0) {
                return "fizz";
            } else if (number % 5 == 0) {
                return "buzz";
            }
        }
        return Integer.toString(number);

    }

}
