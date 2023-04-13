import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class DayTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

/*        System.out.println("Írj be egy számot!");
        int myInt = scanner.nextInt();
        scanner.nextLine();
        // ez kell ide, hogy utána be tudjunk kérni egy stringetm különben bekérés nélkül lefut a program
        System.out.println(myInt);
        // --> itt ne adjunk be neki striget! stringből nem tud int-et csinálni

        // --> először kérjünk be stringet, utána intet, booleant, doublet adjuk meg, ha
        // lehetséges (nem kell scanner.nextLine()-t írni

        System.out.println("Írj be egy stringet!");
        String myString = scanner.nextLine();
        System.out.println(myString);*/

        //1. Feladat: kérj be scannerrel egy nevet és ha megegyezik az egyik feltétellel, akkor köszönj rá

/*        System.out.println("Adj meg egy nevet!");
        String name = scanner.nextLine();

        if (name.equals("Bence")) {
            System.out.println("Helló " + name + "!");
        } else if (name.equals("Bea")) {
            System.out.println("Helló " + name + "!");
        } else if (name.equals("Bálint")) {
            System.out.println("Helló " + name + "!");
        } else if (name.equals("Bori")) {
            System.out.println("Helló " + name + "!");
        } else {
            System.out.println("Hellóbelló!");*/

        // !!!!! --> negcsinálni case-sel is!!!

        // kérj be egy int-et, csinálj egy for ciklust, ait 10-ről indul és 100-ig (inkluzív) megy
        //vizsgálj rá, hogy a bekért számod és a ciklus változó szorzata osztható-e kettővel, ha igen
        // írd ki konzolra a számok szorzatát

/*        System.out.println("Adj meg egy számot");
        int number = scanner.nextInt();

        // 101.fori + enter --> for (int i = 0; i < 101; i++)

        for (int i = 10; i <= 100 ; i++) {
            if ((number * i) % 2 == 0) {
                System.out.print(number * i + " ");
            }
        }*/

        // deubber: F7 lépkedés


        //Egymásba ágyazott for ciklus

/*        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("x");
            }
            System.out.println();
        }*/

        //FELADAT: Írjuk ki a szorzótáblát!

/*        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 ; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }*/

        //FELADAT: kérjünk be egy n változót, írjunk ki n sort és minden sorban  n-szer azt, hogy hányadik sorban vagyunk
/*
        System.out.println("Adj meg egy számot:");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // FELADAT: Kérjünk be egy n számot, írjunk ki n sort, és minden sorban annyiszor "o" karaktert, ahányadik
        //sorban vagyunk
        System.out.println();

        System.out.println("Give me a number:");
        int line = scanner.nextInt();

        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("o");
            }
            System.out.println();
            //de lehet úgy is, hogy az i és a j = 0 és a feltételnél nincs nagyobb egyenlő
        }*/

        //FELADAT: előző feladat visszafelé

/*        System.out.println("Give me a number:");
        int n = scanner.nextInt();*/

/*        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0 ; j--) {
                System.out.print("o ");
            }
            System.out.println();
        }

        System.out.println();*/

/*        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("o ");
            }
            System.out.println();
        }*/

/*
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("o ");
            }
            System.out.println();
        }
*/
        // san frabsiscoból jöttem : programozási tételek videó!! (MEGNÉZNI)

        // vegyünk fel egy változót és csináljunk piramist

        // sor   szóköz       gombóc
        // 1        3           1
        // 2        2           3
        // 3        1           5
        // 4        0           7
        // i      n - i     (i * 2) -1

        System.out.println("Adj me egy számot:");
        int x = scanner.nextInt();

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(".");
            }
            for (int j = 1; j <= (i * 2) - 1 ; j++) {
                System.out.print("o");
            }
            for (int j = 1; j <= x - i; j++) {
                System.out.print(".");
            }
            System.out.println();
        }

        //A felvételinél biztosan lesz kirajzolós feladat

        //Felvételi
        // 16 feladat ha megvan (nem lesz gond)
        // 30 - 20 soros kódok kellenek
        // pár szó angolul (mesélj magadról)


        //TÖMBÖK - adatok tárolására alkalmas (összetett adattípus)
/*
        int[] myArray = new int[5];
        //System.out.println(myArray);
        System.out.println(Arrays.toString(myArray));
        //myArray.fori

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;
    }

        //feltöltöttük a tömböt

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }

        //kiíratjuk a tömböt

        System.out.println();

        int[] secondArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + " ");

        }

        System.out.println();

        //FOR EACH
        //secondArray.iter --> number: a tömb eleme
        for (int number : secondArray) {
            System.out.print(number + " ");
        }
        */
        //Feladat
        //Hozzunk létre egy 10 elem hosszúságú tömböt és töltsük fel őket egy fori ciklusban
        //A tömb értékei mindig az i aktuális értéke *3-al legyen
        // Egy for each ciklusban iteráljunk végig a tömbön és az összes páratlan számot írjuk
        //ki a konzolra

/*        int[] newArray = new int[10];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i * 3;
        }
        for (int number : newArray) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }*/

/*        //Feladat: Számoljuk meg, hány darab 1-es van ebben a tömbben és írjuk ki a konzolra.
        //Adjuk vissza a tömbben lévő számok összegét
        int[] myArray = {1, 1, 1, 2, 0, 2, 1, 1, 1};

*//*        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 1) {
                }
            }*//*

        //segédváltozók!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        int sum = 0;
        int counter = 0;

        for (int number : myArray) {
            if (number == 1) {
                counter++;
            }
            sum += number;
        }


        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 1) {
                counter++;
            }
            sum += myArray[i];
        }

        System.out.println(sum);
        System.out.println(counter);*/


        //2D Arrays - kvázi tömböt tartalmazó tömb


        //be lehet kérni értéket
/*        int arrayLength = scanner.nextInt();
        int[][] myTwoDArray = new int[arrayLength][];*/


/*        int[][] myTwoDArray = new int[5][5];
        // vagy*/
/*        int[][] myTwoDArray = new int[5][0];
        myTwoDArray[0] = new int [5];
        myTwoDArray[1] = new int [5];
        myTwoDArray[2] = new int [10];
        myTwoDArray[3] = new int [5];
        myTwoDArray[4] = new int [5];

        //myTwoDArray [0] = new int [5];
        // első zárójelbe kell csak szám --> ennyi array van az arrayben
        //System.out.println(Arrays.toString(myTwoDArray));
        System.out.println(Arrays.deepToString(myTwoDArray));*/

        //Tömb feltöltése

/*        for (int i = 0; i < myTwoDArray.length; i++) {
            for (int j = 0; j < myTwoDArray[i].length; j++) {
                myTwoDArray[i][j] = j;
            }
        }

        for (int i = 0; i < myTwoDArray.length; i++) {
            for (int j = 0; j < myTwoDArray[i].length; j++) {
                System.out.print(myTwoDArray[i][j]);
            }
            System.out.println();
        }*/

        //inline 2d array initialization

       /* int[][] table = {
                {0, 1, 0, 1},
                {0, 1, 1, 1},
                {1, 0, 0, 1},
                {0, 1, 0, 0},
        };

        //számoljuk meg hány dara 1-es van a tömbökben

        int counter = 0;

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] == 1) {
                    counter++;
                }
            }
        }
        System.out.println(counter);*/
    }
}


