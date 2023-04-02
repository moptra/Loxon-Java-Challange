package hu.progmasters.finally_block;

public class FinallyBlock {

    public static void main(String[] args) {
        /*
            If you want to run some statements both if the try block runs successfully and if an exception is thrown,
            you can put it in a finally block after the catch block(s).
         */
        try {
            firstMethod();
            System.out.println("Everything's fine");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException thrown and caught");
        } finally {
            System.out.println("This will happen anyway");
        }
    }

    private static void firstMethod() {
//        throw new RuntimeException();
    }
}
