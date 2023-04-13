import java.util.Arrays;
import java.util.Scanner;

public class agyas_ciklusok {

    public static void main(String[] args){
/*
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
*/

        //1-től 50-ig prímszámokat kiírni (tömbön belül e1-től 50-ig eltárolni a prímszámokat)
        //felhasználónak kiírni, hogy adjon meg egy számot 1-től 50-ig
        //1től addig a száig kiírni a prímszámokat

        System.out.println("Hello "); System.out.println("world"); System.out.println("!\n");

        System.out.println("Adj meg egy számot 1-től 50-ig:");

        Scanner sca = new Scanner(System.in);


        int[] firstArray = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};

        boolean isDone = false;

        while (false == isDone) {
            int x = sca.nextInt();
            if (1 <= x && x <= 50) {
                for (int i = 0; i < firstArray.length-1; i++) {
                    if (firstArray[i] <= x) {
                        System.out.println(firstArray[i]);
                    }
                }
                isDone = true;
            } else {
                System.out.println("Rossz számot adtál meg. Adj meg egy számot 1-től 50-ig:");

            }

        }

        }
    }

