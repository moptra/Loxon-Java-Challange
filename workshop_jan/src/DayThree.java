import java.util.Scanner;

public class DayThree {
    public static void main(String[] args) {
        //Tömb létrehozása
        //tároljunk el tömbben számokat és írjuk ki őket fordított szorrendben

        Scanner scan = new Scanner(System.in);

        //

/*        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.print(myArray[i] + " ");

        }*/

        //number * number nagyságú szorzótábla (bekérni a konzolról)
        // 2 d-s array feltöltése (szorzótábla)

/*        int firstNumber = scan.nextInt();

        int [][] twoDArray = new int [firstNumber][firstNumber];

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                twoDArray [i][j] = (i + 1) * (j + 1);
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }*/

        //game of life
        // élő : 1, halott: 0
        //A sejt túléli a kört, ha két vagy három szomszédja van.
        //A sejt elpusztul, ha kettőnél kevesebb (elszigetelődés),
        // vagy háromnál több (túlnépesedés) szomszédja van.
        //Új sejt születik minden olyan cellában, melynek környezetében
        // pontosan három sejt található.

        int[][] gameOfLife = {
                {0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0},
                {0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
        };

        int oneCounterNextToOne = 0;
        int oneCounterNextToZero = 0;

        int[][] gameOfLifeResult = new int[gameOfLife.length][gameOfLife.length];

        for (int x = 1; x < gameOfLife.length - 1; x++) {
            for (int y = 1; y < gameOfLife[x].length - 1; y++) {
                if (gameOfLife[x][y] == 1) {
                    for (int i = x - 1; i <= x + 1; i++) {
                        for (int j = y - 1; j <= y + 1; j++) {
                            if (gameOfLife[i][j] == 1) {
                                oneCounterNextToOne++;
                            }
                        }

                    }
                    oneCounterNextToOne = oneCounterNextToOne - 1;

                    if (oneCounterNextToOne == 2 && oneCounterNextToOne == 3) {
                        gameOfLifeResult[x][y] = 1;
                    } else if (oneCounterNextToOne < 2) {
                        gameOfLifeResult[x][y] = 0;
                    } else {
                        gameOfLifeResult[x][y] = 0;
                    }

                } else {
                    for (int i = x - 1; i <= x + 1; i++) {
                        for (int j = y - 1; j <= y + 1; j++) {
                            if (gameOfLife[i][j] == 1) {
                                oneCounterNextToZero++;
                            }

                        }
                    }
                    if (oneCounterNextToZero == 3) {
                        gameOfLifeResult[x][y] = 1;
                    } else {
                        gameOfLifeResult[x][y] = 0;
                    }
                }

            }

        }
        for (int i = 0; i < gameOfLifeResult.length; i++) {
            for (int j = 0; j < gameOfLifeResult[i].length; j++) {
                System.out.print(gameOfLifeResult[i][j]);
            }
            System.out.println();
        }
    }
}