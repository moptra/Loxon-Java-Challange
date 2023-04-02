package hu.progmasters.checked_and_unchecked;

/*
    The following program shows you the difference between checked and unchecked exceptions.

    Unchecked exceptions extend the RuntimeException class. All the exceptions you've met before were unchecked
    ones. We use them to resolve issues that happen at runtime (like getting invalid input from the user).

    Checked exceptions extend the Exception class but not the RuntimeException (see the picture in READE.md).
    They are the more strict version of RuntimeException. We also use them to resolve issues that happen at runtime(!),
    but the compiler checks if we are prepared to handle the situation if a checked exception is thrown.
    What does this means?

    For a checked exception, you must do one of the following two things:
    - you can either catch it with a try-catch block
    - or you can mark your method that it throws the checked exception
    If you miss both of these things, the code won't compile.
    If you mark your method that it can throw a checked exception you must do one of the two options from where you are
    calling this method (either wrap the method call in a try-catch or delegate the problem upward).

    There are a lot of built in exceptions in java, both checked and unchecked ones. The general logic for knowing which
    ones are checked and which unchecked, is that unchecked ones usually represent problems with a user input (like
    the NumberFormatException) or a more generic situation (like NullPointer or ArrayIndexOutOfBounds), while checked
    exceptions are usually for things where it is more important to be prepared for problems or for when you are using
    outside resources (like opening a file on the hard drive or creating a network connection).

    If you create a custom exception class in your project, it is usually a better practice to make it an unchecked one.
*/
public class Exceptions6 {

    public static void main(String[] args) {

        // TODO catch the unchecked exception and print its stacktrace
        throwUncheckedException();

        // TODO: uncomment the following method call and try to compile and run your program
        // Why is it not compiling? How could you solve this?
//        throwCheckedException();

    }

    private static void throwUncheckedException() {
        throw new UncheckedException();
    }

    private static void throwCheckedException() throws CheckedException {
        throw new CheckedException();
    }
}
