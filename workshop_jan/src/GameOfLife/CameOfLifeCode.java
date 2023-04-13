package GameOfLife;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CameOfLifeCode {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int twoDArraySize = scan.nextInt();
        int firstTwoDArray[][] = new int[twoDArraySize][twoDArraySize];
        int secondTwoDArray[][] = new int[twoDArraySize][twoDArraySize];
        Random rand = new Random();
        boolean shallContinue = true;

        for (int i = 1; i < firstTwoDArray.length - 1; i++) {
            for (int j = 1; j < firstTwoDArray.length - 1; j++) {
                firstTwoDArray[i][j] = rand.nextInt(2);
            }
        }

        for (int i = 0; i < firstTwoDArray.length; i++) {
            for (int j = 0; j < firstTwoDArray.length; j++) {
                System.out.print(firstTwoDArray[i][j] + "  ");
            }
            System.out.println();
        }

        do {
            int continueCounter = 0;

            for (int i = 1; i < firstTwoDArray.length - 1; i++) {
                for (int j = 1; j < firstTwoDArray[i].length - 1; j++) {
                    int cellSum = 0;
                    cellSum = firstTwoDArray[i - 1][j - 1] + firstTwoDArray[i - 1][j]
                            + firstTwoDArray[i - 1][j + 1] + firstTwoDArray[i][j - 1] + firstTwoDArray[i][j + 1] +
                            firstTwoDArray[i + 1][j - 1] + firstTwoDArray[i + 1][j] + firstTwoDArray[i + 1][j + 1];

                    if (cellSum == 3) {
                        secondTwoDArray[i][j] = 1;
                    } else if (cellSum < 2 || cellSum > 3) {
                        secondTwoDArray[i][j] = 0;
                    } else if (firstTwoDArray[i][j] == 1 && cellSum == 2) {
                        secondTwoDArray[i][j] = 1;
                    } else {
                        secondTwoDArray[i][j] = 0;
                    }
                }
            }

            System.out.println();

            for (int i = 0; i < secondTwoDArray.length; i++) {
                for (int j = 0; j < secondTwoDArray.length; j++) {
                    System.out.print(secondTwoDArray[i][j] + "  ");
                    continueCounter += secondTwoDArray[i][j];
                }
                System.out.println();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (continueCounter == 0) {
                shallContinue = false;
            }

            firstTwoDArray = secondTwoDArray;

        } while (shallContinue);
    }
}


