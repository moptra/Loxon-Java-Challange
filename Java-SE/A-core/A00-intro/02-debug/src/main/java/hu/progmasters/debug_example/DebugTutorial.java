package hu.progmasters.debug_example;

public class DebugTutorial {

    public static void main(String[] args) {
        //---------------------------------------------------------------------------------
        //This couple of methods will help you, to get a better understanding of the debugger in IDEA
        //Just follow the instructions given in the comments!
        //---------------------------------------------------------------------------------

        // 1.
        //First put a breakpoint on the next line of code, and run the app in debug mode!
        //You will notice, that the application has stopped at this point, waiting for interaction!
        // If you press F8 - Step Over, you will see that it has jumped on the next line of code, waiting for further interaction,
        // even though, you didn't set any breakpoints on that line.
        //After this terminate the app, and remove the breakpoints you just set
        System.out.println("My first breakpoint in Java! Cool!");
        System.out.println("I Stepped over here, from the breakpoint!");

        //2
        //Second we gonna use another nice feature call step-into
        //For this, place a breakpoint on the next line of code, and run the app in debug mode
        // If you keep pressing F8 once again, you will see, that it simply jumps from line to line
        //Now re-run the application, but when standing on the line 'callAMethod()' instead of F8, press F7-Step into
        //You will realize, that the debugger (guess what!?) Stepped into the method it invoked, now if you keep pressing F8,
        // it will keep jumping from line to line
        //After this terminate the app, and remove the breakpoints you just set
        System.out.println("Before method call...");
        callAMethod();
        System.out.println("After method call...");

        //3
        //Another nice tool you may use, is the F9 button
        //To test this feature, just place a breakpoint anywhere inside the following for loop, and run the app in debug mode
        //The application, as you have seen before, will pause at the first breakpoint it finds. However,
        // to make debugging easier in many cases, try pressing F9-Resume execution button, you fill see, that it has jumped across all the code,
        // and stopped only at the next breakpoint it found
        for (int i = 0; i < 10; i++) {
            System.out.println("I am inside the for loop!!");
            System.out.println(i);
        }

        //4
        //And last, you may use the same for loop, with the same breakpoint you just used.
        //Just have a look on the bottom of the window, inside the 'Debug' tab.
        //While running your application in debug mode, when idle-ing on any breakpoints, you may inspect the
        // current context of the application, such as the call-stack (on the left),
        // or the values of any currently existing variables (on the right)
    }

    private static void callAMethod() {
        System.out.println("Inside of method...");
    }
}
