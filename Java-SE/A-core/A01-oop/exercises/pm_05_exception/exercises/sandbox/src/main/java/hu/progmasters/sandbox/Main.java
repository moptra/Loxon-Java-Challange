package hu.progmasters.sandbox;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    /*
     * Play a little bit with the following application,
     * and inspect how it behaves, handles certain errors
     *
     * Note, when will each branch run. Such as the part
     * - after the occurrence after the error
     * - each of the catch-blocks
     * - finally-block
     * - the part after the try
     * - catch block
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int a = 1;
            int divisor = scanner.nextInt();
            if (divisor == 0) {
                throw new ArithmeticException();
            }
            System.out.println(a / divisor);
        } catch (InputMismatchException ime) {
            System.out.println("invalid input! ");
        } catch (ArithmeticException e) {
            System.out.println("you cannot divide by zero! ");
            throw new OutOfMemoryError();
        } catch (OutOfMemoryError e) {
            System.out.println("you can even catch errors!");
        } finally {
            System.out.println("closing scanner in finally!");
            scanner.close();
        }
        System.out.println("after try-catch-finally block!");
    }
}
