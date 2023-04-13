import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class Continue {
    public static void main(String[] args) {
        //Elégazások
        //a program sokszor külső bejövő paraméterektől függ

        int number = 6;
        if (number == 5) {
            System.out.println("Ez a szám 5");
        } else if (number == 6) {
            System.out.println("Ez a szám 6");
        } else {
            System.out.println("Ez a szám nem egyenlő 5-tel és hattal");
        }

        //FELADAT

        int age = 18;
        if (age == 18) {
            System.out.println("Már pont ihatsz alkoholt.");
        } else if (age < 18) {
            System.out.println("Még nem ihatsz alkoholt.");
        } else {
            System.out.println("Már ihatsz alkoholt.");
        }

        //Back to logikai operátors
        // és &&
        //vagy ||
        //negálás !

        int numberAgain = 10;

        //és
        if (numberAgain > 5 && numberAgain % 2 == 0 && numberAgain != 8) {
            System.out.println("Igaz");
        }

        //vagy
        if (numberAgain > 5 || numberAgain % 2 == 0 || numberAgain != 8) {
            System.out.println("Igaz");
        }

        boolean isTrue = true;

        //negálás
        if (!isTrue) {
            System.out.println("Igaz");
        }

        // Nem jó megoldás!! Mert az a fontos, hogy a FizzBuzzt írja ki főként
        int x = 10;
        if (x < 20 && x % 2 == 0) {
            System.out.println("Fizz");
        } else if (x > 20 && x % 2 != 0) {
            System.out.println("Buzz");
        } else if (x == 20 || x % 5 == 0) {
            System.out.println("FizzBuzz");
        }


        //ez a jó megoldás
        int y = 20;
        if (y == 20 || y % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (y < 20 && y % 2 == 0) {
            System.out.println("Fizz");
        } else if (y > 20 && y % 2 != 0) {
            System.out.println("Buzz");
        }

        //Switch (olyan, mint az else if)
        // megadott eseteket vizsgál sorrendben

        String color = "Red";
        switch (color) {
            case "Yellow":
                System.out.println("Sárga");
                break;

            // belép itt és innen mindnet kiír, hacsak nem adjauk meg --> break
            case "Red":
                System.out.println("Piros");
                break;

            case "Blue":
                System.out.println("Kék");
                break;

            case "Purple":
                System.out.println("Lila");
                break;

            default:
                System.out.println("Lefutottam");
                //az else-nek felel meg
        }

        String name = "Gizi";
        switch (name) {
            case "Alduss":
                System.out.println("Szia Alduss!");
                break;

            case "Roli":
                System.out.println("Szia Roli!");
                break;

            case "Ádám":
                System.out.println("Szia Ádám!");
                break;

            default:
                System.out.println("Szia " + name + "!");
        }

        //Ciklusok - akkor hazsnáljuk őket, ha azt szeretnénk, hogy valami többször fusson le
        //For ciklus

        //i = 0 --> kezdeti érték
        //i < n --> kilépési feltétel
        //i++ --> i = i + 1

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        //Feladat, írjuk ki a számokat 1-től 20-ig, de csak ha párosak

        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }

        for (int i = 2; i <= 20; i++) {
            System.out.print(i + " ");
            i++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }
        System.out.println("Vége van a ciklusnak");

        /*for (int i = 0; i < 10; i--) {
            System.out.println(i);*/
        // --> infinite loopot csinálna ez

        //FELADAT
        /*Jírjuk ki mindig az i kétszeresét egy sorban space-szel elcálasztva.
        Az i induljon 1-től és tartson 20-ig*/

        for (int i = 1; i <= 20; i++) {
            System.out.print((i * 2) + " ");
        }

        for (int i = 1; i <= 20; i *= 2) {
            System.out.println(i + " ");
        }

        String word = "bird";

        int wordLength = word.length();

        char firstChar = word.charAt(0);
        char secondChar = word.charAt(1);

        String firstHalf = word.substring(0, 2);
        System.out.println(firstHalf);

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }


        String newWord = "sziókamióka";

        int newWordLenght = newWord.length();

/*        for (int i = 0; i < newWord.length(); i++) {
            System.out.println(newWord.charAt(0, i + 1));

            --> substring kellett volna!!!
        }*/

        // word.lenght.fori

        for (int i = 1; i < newWord.length(); i++) {
            System.out.println(newWord.substring(0, i));
        }

        for (int i = 0; i < newWord.length(); i++) {
            System.out.println(newWord.substring(0, i + 1));
        }

        //FELADAT
        //Vakációt írjuk ki egyesével visszafelé

        String szunet = "vakáció";

        for (int i = 0 ; i < szunet.length(); i++) {
            System.out.println(szunet.substring((szunet.length() - 1 - i), szunet.length()));
        }
        System.out.println("A program lefutott");

        //vagy

        for (int i = szunet.length() - 1; i >= 0; i--) {
            System.out.println(szunet.substring(i));
        }
        System.out.println("A program lefutott");
    }
}

