import java.util.Arrays;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        String [] myFirstArray = new String[3];
        System.out.println(myFirstArray);
        System.out.println(Arrays.toString(myFirstArray));

        int[] myFirstInt = {2, 5, 7, 34, -54, 42};
        System.out.println(myFirstInt[5]);

        System.out.println(Arrays.toString(myFirstInt));
        System.out.println(Arrays.toString(myFirstArray));

        for (int i = 0; i < myFirstInt.length; i++) {
            System.out.println("A tömböm " + (i+1) + ". eleme: " + myFirstInt[i]);
        }

        //Értékadás tömbnek for ciklussal
        int[] anotherArray = new int[6];
        for (int i = 0; i < anotherArray.length; i++) {
            anotherArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(anotherArray));

        //for each (változó.iter)
        for (int a : myFirstInt) {
            System.out.println(a);
        }
        for (String s : myFirstArray) {
            System.out.println("A tömb következő eleme: " + s);
        }
        
        //Ciklusok egymásba ágyazása
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

/*        Scanner sca = new Scanner(System.in);
        String myFirstString = sca.nextLine();
        System.out.println(myFirstString + "!");*/

        Scanner sca = new Scanner(System.in);
        int mySecondInt = sca.nextInt();
        System.out.println("A számom: " + mySecondInt * 10);

        System.out.println();




        }

}
