import java.util.Random;
import java.util.Scanner;

public class GameOfLifeCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] firstTable = new int[n][n];
        int[][] secondTable = new int[n][n];
        Random random = new Random();
        boolean isNotEmpty = true;
        int counter = 0;

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                firstTable[i][j] = random.nextInt(2);
            }
        }
       /* for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(firstTable[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();*/
        do {
            for (int i = 1; i < n - 1; i++) {
                for (int j = 1; j < n - 1; j++) {
                    int neighbourSum = firstTable[i - 1][j - 1] + firstTable[i - 1][j] + firstTable[i - 1][j + 1]
                            + firstTable[i][j - 1] + firstTable[i][j + 1] + firstTable[i + 1][j - 1] +
                            firstTable[i + 1][j] + firstTable[i + 1][j + 1];
                    if (neighbourSum == 2 || neighbourSum == 3) {
                        secondTable[i][j] = 1;
                    } else if (neighbourSum > 3 || neighbourSum < 2) {
                        secondTable[i][j] = 0;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (secondTable[i][j] == 0) {
                        System.out.print("  ");
                    } else System.out.print(secondTable[i][j] + " ");
                }
                System.out.println();


            }
            System.out.println("==============================");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    counter += secondTable[i][j];
                }
            }
            if (counter == 0) {
                isNotEmpty = false;
            }
            firstTable = secondTable;
        } while (isNotEmpty);
    }
}
