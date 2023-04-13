import java.util.Scanner;
import java.util.stream.*;

public class EntryTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1. Feladat
        // Írj olyan programot, ami egy n szám alapján (ez lehet egy előre definiált változó)
        // kirajzol egy aranytömböt.
        // A tömb közepére írj egy G betűt! Ha a tömb oldalának hossza páros hosszúságú,
        // akkor a közepétől balra felfelé
        // levő helyre kerüljön a felirat.
        //Megjegyzés: Javaban a “\” karakter kiírását “\\” karakterek legépelésével lehet elérni!
        //
        //Példa:
        //n = 5 esetén
        ///---\
        //|   |
        //| G |
        //|   |
        //\---/
        //
        //
        //n = 6 esetén
        ///----\
        //|    |
        //| G  |
        //|    |
        //|    |
        //\----/

        int n = 8;

        String[][] myArray = new String[n][n];

        myArray[0][0] = "/";
        myArray[0][n - 1] = "\\";
        myArray[n - 1][0] = "\\";
        myArray[n - 1][n - 1] = "/";

        for (int i = 1; i <= (myArray[0].length - 2); i++) {
            myArray[0][i] = "-";
        }

        for (int i = 1; i <= myArray[n - 1].length - 2; i++) {
            myArray[n - 1][i] = "-";

        }
        for (int i = 1; i <= myArray.length - 2; i++) {
            myArray[i][0] = "|";
        }

        for (int i = 1; i <= myArray.length - 2; i++) {
            myArray[i][n - 1] = "|";

        }

        for (int i = 1; i <= myArray.length - 2; i++) {
            for (int j = 1; j <= myArray[i].length - 2; j++) {
                myArray[i][j] = " ";
            }
        }

        if (n % 2 == 0) {
            myArray[(n / 2) - 1][(n / 2) - 1] = "G";
        } else if (n % 2 == 1) {
            myArray[(n - 1) / 2][(n - 1) / 2] = "G";

        }

        for (int i = 0; i <= myArray.length - 1; i++) {
            for (int j = 0; j <= myArray[i].length - 1; j++) {
                System.out.print(myArray[i][j]);

            }
            System.out.println();

        }
    }
}


