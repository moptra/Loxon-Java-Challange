import java.sql.SQLOutput;
import java.util.Scanner;

public class pract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1. Task
        //Write a program that asks the user for an integer and prints
        // the string "Speeding ticket!" if the input is greater than 120.

/*          System.out.println("Give speed:");
        int speed = scan.nextInt();

        if (speed > 120) {
            System.out.println("Speeding Ticket!");
        }*/

        //2. Task:
        // Write a program that prompts the user for
        // an integer and prints the string "Orwell" if the number is exactly 1984.
/*        int orwell = scan.nextInt();
        if (orwell == 1984) {
            System.out.println("Orwell");
        }*/

        //Task 3. Write a program that prompts the user for a year. If the user inputs a number that
        // is smaller than 2015, then the program prints the string "Ancient history!".
/*        int year = scan.nextInt();
        if (year < 2015) {
            System.out.println("Ancient history!");
        }*/

        //Task 4. Write a program that prompts the user for an integer and informs the user
        // whether or not it is positive (greater than zero).
/*        int number = scan.nextInt();
        if (number > 0) {
            System.out.println("Your number is positive.");
        } else {
            System.out.println("Your number is negativ.");
        }*/

        //Task 5. Write a program that prompts the user for their age and tells them whether
        //or not they are an adult (18 years old or older).
 /*       System.out.println("How old are you?");
        int age = scan.nextInt();
        if (age < 18) {
            System.out.println("You are not old enough.");
        } else {
            System.out.println("You're an adult.");
        }*/

        //Task 6. Write a program that prompts the user for two integers and prints the
        // larger of the two. If the numbers are the same, then the program informs us about this as well.
/*        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a > b) {
            System.out.println(a);
        } else if (a < b) {
            System.out.println(b);
        } else {
            System.out.println("The numbers ara equal.");
        }*/

        //Task 7. Grades and points
/*        int score = scan.nextInt();
        if (score < 0) {
            System.out.println("Impossible!");
        } else if (0 <= score && score <= 49) {
            System.out.println("Grade: Failed.");
        } else if (50 <= score && score <= 59) {
            System.out.println("Grade: 1");
        } else if (60 <= score && score <= 69) {
            System.out.println("Grade: 2");
        } else if (70 <= score && score <= 79) {
            System.out.println("Grade: 3");
        } else if (80 <= score && score <= 89) {
            System.out.println("Grade: 4");
        } else if (90 <= score && score <= 100) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("Grade: Incredible!");
        }*/

        //Task 8. Write a program that prompts the
        // user for a number and informs us whether it is even or odd.
/*        System.out.println("Give me a number:");
        int number = scan.nextInt();
        if (number % 2 == 0) {
            System.out.println("This number is even.");
        } else if (number % 2 == 1) {
            System.out.println("This number is odd.");
        } else {
            System.out.println("Invalid number!");
        }*/

        // Task 9. Write a program that prompts the user for
        // a password. If the password is "Caput Draconis" the program
        // prints "Welcome!". Otherwise, the program prints "Off with you!"
/*
        System.out.println("Give me the password!");
        String password = scan.nextLine();
        if (password.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }*/

        //Task 10. Write a program that prompts the user for two strings.
        // If the strings are the same, then the program prints "Same".
        // Otherwise, it prints "Different".
/*        System.out.println("Give me the first string:");
        String firstString = scan.nextLine();
        System.out.println("Give ne the second string");
        String secondString = scan.nextLine();
        if (firstString.equals(secondString)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }*/

        //Task 11. Write a program that prompts the user to input their age and checks
        // whether or not it is possible (at least 0 and at most 120).
        // Only use a single if-command in your program.
/*
        System.out.println("Give my your age:");
        int age = scan.nextInt();
        if (0 <= age && age <= 120) {
            System.out.println("It's possible.");
        } else {
            System.out.println("It's impossible.");
        }*/

        //Task 12. A year is a leap year if it is divisible by 4. However, if the year is divisible
        // by 100, then it is a leap year only when it is also divisible by 400.
        //Write a program that reads a year from the user, and checks whether or not it is a leap year.
/*        System.out.println("Give me a year, and I'll tell you if it's a leap year or not.");
        int year = scan.nextInt();
        if (year % 4 == 0 && year % 100 == 0 && year % 400== 0) {
                System.out.println("This is a leap year.");
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 != 0) {
                System.out.println("This is not a leap year");
        } else if (year % 4 == 0) {
            System.out.println("This is a leap year");
        } else {
            System.out.println("This is not a leap year");
        }*/

        //Task 13. Gifting tax
/*        System.out.println("Give me the value of the gift:");
        double gift = scan.nextDouble();
        if (5000 <= gift && gift <= 25000) {
            System.out.println("Tax: " + 100 + (gift - 5000) * 0.08);
        } else if (25000 < gift && gift <= 55000) {
            System.out.println("Tax: " + 1700 + (gift - 25000) * 0.10);
        } else if (55000 < gift && gift <= 200000) {
            System.out.println("Tax: " + 4700 + (gift - 55000) * 0.12);
        } else if (200000 < gift && gift <= 1000000) {
            System.out.println("Tax: " + 22100 + (gift - 200000) * 0.15);
        } else if (1000000 < gift) {
            System.out.println("Tax: " + 142100 + (gift - 1000000) * 0.17);
        } else if (gift <= 5000) {
            System.out.println("No Tax!");
        }*/

        //Task 14. Write a program by using the loop example that asks
        // "Shall we carry on?" until the user inputs the string "no".


/*        while (true) {
            System.out.println("Shall we carry on? (Stop with: no)" );
            String dec = scan.nextLine();
            if (dec.equals("no")) {
                break;
            }
            System.out.println("Okay, lets carry on!");
        }
        System.out.println("Ready!");*/

        //Task 15. Write a program, according to the preceding example,
        // that asks the user to input values until they input the value 4.


/*        while(true) {
            System.out.println("Give me a number. (Give 4 to exit.)");
            int number = scan.nextInt();
            if (number == 4) {
                System.out.println("exited.");
                break;
            }

        }*/

        //Task 16. Write a program that asks the user for numbers. If the number
        // is negative (smaller than zero), the program prints for user
        // "Unsuitable number" and asks the user for a new number.
        // If the number is zero, the program exits the loop.
        // If the number is positive, the program prints the number to the
        // power of two.

/*        while (true) {
            System.out.println("Give me a positive number!");
            int number = scan.nextInt();
            if (number < 0) {
                System.out.println("Unsuitable number.");
                continue;
            } else if (number > 0) {
                System.out.println("The power of your number is: " + (number *= number));
                continue;
            } else {
                System.out.println("Exited.");
                break;
            }
        }*/

        //Task 17. (Csabi's present) Kapok egy számot vissza kell adni, hogy prímszám-e
        //vagy sem. 
/*        System.out.println("Adj meg pozitív számot:");
        int number = scan.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                System.out.println("Nem prímszám.");
                break;
            }
        }
        if (isPrime == true) {
            System.out.println("Ez egy prímszám.");
        }*/

        //Task 18. Write a program that reads values from the
        // user until they input a 0. After this, the program prints the total
        // number of inputted values. The zero that's used to exit the loop should not
        // be included in the total number count.

/*        int counter = 0;
        boolean go = true;

        while (go) {
            int number = scan.nextInt();
            if (number != 0) {
                counter++;
                continue;
            } else if (number == 0) {
                go = false;
            }
            System.out.println("Ennyi számot adtál be ezelőtt: " + counter);
        }*/

        //Task 19. Write a program that reads values from the user until they input a 0.
        // After this, the program prints the total number of inputted values that are negative.
        // The zero that's used to exit the loop should not be included in the total number count.

/*        int counter = 0;
        boolean go = true;

        while (go) {
            int number = scan.nextInt();
            if (number != 0) {
                if (number < 0) {
                    counter++;
                }
                continue;
            } else if (number == 0) {
                go = false;
            }
        }
        System.out.println("Ennyi negatív számot adtál be ezelőtt: " + counter);*/

        //Task 20. Write a program that reads numbers from the user until the user
        // inputs a number 0. After this the program outputs the sum of the numbers.
        // The number zero does not need to be added to the sum, even if it does not change the results.ű
/*
        int sum = 0;
        boolean go = true;

        while (go) {
            System.out.println("Adj egy számot: ");
            int number = scan.nextInt();
            if (number != 0) {
                sum += number;
            } else if (number == 0){
                go = false;
            }
        }
        System.out.println("Az ezelőtt beadott számok összege: " + sum);
*/

        //Task 21. Write a program that asks the user for input until the user inputs 0. After this the program
        // prints the amount of numbers inputted and the sum of the numbers. The number zero does not need to
        // be added to the sum, but adding it does not change the results. You need two variables to keep track
        // of the information. Use one for keeping track of the numbers inputted and other for keeping track of
        // the sum.

/*        int counter = 0;
        int sum = 0;
        boolean go = true;

        while (go) {
            System.out.println("Adj meg egy számot:");
            int number = scan.nextInt();
            if (number != 0) {
                counter++;
                sum += number;
            } else {
                go = false;
            }
        }
        System.out.println("Ezelőtt ennyi számot adtál be: " + counter);
        System.out.println("Az ezelőtt beadott számok összértéke: " + sum);*/

        //Task 22. Write a program that asks the user for input until the user inputs 0. After this, the program
        // prints the average of the numbers. The number zero does not need to be counted to the average. You may
        // assume that the user inputs at least one number. The average of the numbers can be calculated by dividing
        // the sum of numbers with the amount of the numbers

/*
        double counter = 0;
        double sum = 0;
        boolean go = true;

        while (go) {
            System.out.println("Adj meg egy számot:");
            int number = scan.nextInt();
            if (number != 0) {
                counter++;
                sum += number;
            } else {
                go = false;
            }
        }
        System.out.println("Az ezelőtt beadott számok átlaga: " + (sum / counter));
*/
        // Task 23. Write a program that asks the user for input until the user inputs 0. After this, the program
        // prints the average of the positive numbers (numbers that are greater than zero). If no positive number
        // is inputted, the program prints "Cannot calculate the average"

/*        double sum = 0;
        double counter = 0;
        boolean go = true;
        boolean isAllNumberNegative = true;

        while (go) {
            System.out.println("Adj meg egy számot:");
            double number = scan.nextDouble();
            if (number != 0) {
                if (number > 0) {
                    sum += number;
                    counter++;
                }
            } else {
                go = false;
            }
        }
        if (sum == 0) {
            System.out.println("Cannot calculate avarage.");
        } else {
            System.out.println("The avarage is: " + (sum / counter));
        }*/

        //Task 24. Write a program that reads an integer from the user. Next, the program prints numbers
        // from 0 to the number given by the user. You can assume that the user always gives a positive number.
        // Below are some examples of the expected functionality.
/*        System.out.println("Give me a positive number:");
        int number = scan.nextInt();

        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }*/

        //Task 25. Write a program, which reads an integer from the user.
        // Then the program prints numbers from that number to 100. You can assume that
        // the user always gives a number less than 100. Below are some examples of the expected functionality.

/*        System.out.println("Give me a number, which is less than 100:");
        int number = scan.nextInt();

        for (int i = number; i <= 100; i++) {
            System.out.println(i);

        }*/

        //Task 26. Write a program which prints the integers from 1 to a number given by the user.
        //Ask the user for the starting point as well.

/*
        System.out.println("Where to?:");
        int end = scan.nextInt();
        System.out.println("Where from?");
        int start = scan.nextInt();


        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
*/
/*        for (int i = 0; i != 100; i++) {
            System.out.println(i);
            i = 100;
            System.out.println(i);
            i = 0;
        }*/

        //Task 27. Implement a program, which calculates the sum 1+2+3+...+n where n is given as user input.
/*        System.out.println("Last number?");
        int sum = 0;

        int number = scan.nextInt();
        for (int i = 1; i <= number ; i++) {
            sum += i;
        }
        System.out.println(sum);*/

        //Task 28. Implement a program which calculates the sum of a closed interval, and prints it.
        // Expect the user to write the smaller number first and then the larger number. You can base your
        // solution to this exercise to the solution of last exercise — add the functionality for the user
        // to enter the starting point as well.

/*        System.out.println("First number?");
        int firstNumber = scan.nextInt();;
        System.out.println("Second number?");
        int secondNumber = scan.nextInt();
        int sum = 0;

        for (int i = firstNumber; i <= secondNumber; i++) {
            sum += i;
        }
        System.out.println(sum);*/

        // Task 29. Implement a program which calculates the factorial of a number given by the user.
        // Factorial of n, denoted n!, is calculated as 1 * 2 * 3 * ... * n. For example, the factorial
        // of 4 is 24 or 4! = 1 * 2 * 3 * 4 = 24. Additionally, it has been specified that
        // the factorial of 0 is 1, so 0! = 1.

/*        System.out.println("Give me a number:");
        int number = scan.nextInt();
        int factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
        System.out.println("Factorial: " + factorial);*/

        //Task 30. The program handles negative numbers as invalid, and zero stops the loop.
        // When the user enters zero, the program prints the sum of valid numbers, the number
        // of valid numbers and the number of invalid numbers.

/*        boolean go = true;
        int validCounter = 0;
        int invalidCounter = 0;
        int sum = 0;

        while (go) {
            System.out.println("Give me a positive number:");
            int number = scan.nextInt();
            if (number == 0) {
                go = false;
                break;
            }
            if (number > 0) {
                validCounter++;
                sum += number;
            } else if (number < 0) {
                invalidCounter++;
            }
        }
        System.out.println("Sum of valid numbers: " + sum);
        System.out.println("Invalid numbers: " + invalidCounter);
        System.out.println("Valid numbers: " + validCounter);*/

        //Task 31.
        // A) Implement a program that asks the user for numbers
        // (the program first prints "Write numbers: ") until the user gives the number -1.
        // When the user writes -1, the program prints "Thx! Bye!" and ends.

/*        boolean go = true;

        while (go) {
            System.out.println("Write numbers:");
            int number = scan.nextInt();
            if (number == -1) {
                go = false;
            }
        }
        System.out.println("Thx! Bye!");*/

        //B) Extend the program so that it prints the sum of the numbers
        // (not including the -1) the user has written.

/*        boolean go = true;
        int sum = 0;

        while (go) {
            System.out.println("Write numbers:");
            int number = scan.nextInt();
            if (number == -1) {
                go = false;
            } else {
                sum += number;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);*/

        // C) Extend the program so that it also prints the
        // number of numbers (not including the -1) the user has written.
/*        boolean go = true;
        int sum = 0;
        int counter = 0;

        while (go) {
            System.out.println("Write numbers:");
            int number = scan.nextInt();
            if (number == -1) {
                go = false;
            } else {
                sum += number;
                counter++;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers " + counter);*/

        // D) Extend the program so that it prints the mean of the numbers
        // (not including the -1) the user has written.

/*
        boolean go = true;
        double sum = 0;
        double counter = 0;

        while (go) {
            System.out.println("Write numbers:");
            double number = scan.nextInt();
            if (number == -1) {
                go = false;
            } else {
                sum += number;
                counter++;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers " + counter);
        System.out.println("Mean: " + (sum / counter));
*/

        // E) Extend the program so that it prints the number of even and odd numbers (excluding the -1).

        boolean go = true;
        double sum = 0;
        double oddCounter = 0;
        double evenCounter = 0;

        while (go) {
            System.out.println("Write numbers:");
            double number = scan.nextInt();
            if (number == -1) {
                go = false;
            } else {
                sum += number;
                if (number % 2 == 0) {
                    evenCounter++;
                } else {
                    oddCounter++;
                }
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers " + (oddCounter + evenCounter));
        System.out.println("Mean: " + (sum / (oddCounter + evenCounter)));
        System.out.println("Odd: " + oddCounter);
        System.out.println("Even: " + evenCounter);


    }
}











