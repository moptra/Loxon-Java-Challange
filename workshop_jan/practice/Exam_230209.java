import java.util.Scanner;

public class Exam_230209 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();

        for (int i = 0; i < (rows * 2) + 2; i++) {
            System.out.print(".");
        }
        System.out.println();

        for (int i = 1; i <= rows; i++) {
            for (int space = 0; space < i; space++) {
                System.out.print(".");
            }

            System.out.print("\\");

            for (int space = 0; space < ((rows * 2) - 2 * i); space++) {
                System.out.print(".");
            }

            System.out.print("/");

            for (int space = 0; space < i; space++) {
                System.out.print(".");
            }
            System.out.println();
        }

        for (int i = 1; i <= rows; i++) {
            for (int space = 0; space < (rows - i) + 1; space++) {
                System.out.print(".");
            }

            System.out.print("/");

            for (int space = 0; space < (i * 2) - 2; space++) {
                System.out.print(".");
            }

            System.out.print("\\");

            for (int space = 0; space < (rows - i) + 1; space++) {
                System.out.print(".");
            }
            System.out.println();
        }
        for (int i = 0; i < (rows * 2) + 2; i++) {
            System.out.print(".");
        }
        System.out.println();
    }
}
