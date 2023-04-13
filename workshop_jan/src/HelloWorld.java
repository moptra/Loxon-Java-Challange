public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Primitívek
        //Egész számok
        byte myByte = 1;
        //-128-tól 127-ig
        short myShort = 10;
        int myInt = 100;
        long myLong = 1000;
        //Főként az intet használjuk, az 32 bytle, a long 64 byte

        //Lebegőpontos számok
        float myFloat = 1.5f;
        //itt lehet nagy F betűt is használni
        double myDouble = 100.5d;
        //oda lehet írni a d-t a végére, de nem kötelező, lehet kicsi és nagy betű

        //Boolean (elágazásoknál használjuk)
        boolean myBoolean = true;
        boolean mySecondBoolean = false;
        //máshogy is adhatunk neki értéket
        boolean myThirdBoolean = myInt < myLong;
        //ha ez igaz, akkor igaz lesz az értéke
        System.out.println(myThirdBoolean);
        // leírom, h myThirdBoolean, aztán pont, kiválasztjuk, hogy sout --> tök gyors

        //Komment --> ezzel nem foglalkozik futtatásokor
        //cleencooding szerint úgy kell kódolni, hogy ne legyen szükség a kommentekre

        //Char
        char myChar = 'a';
        // csak egy db karaktert tud tárolni, ami lehet szám is, csak nem számként kezeli

        //Arithmetic operators
        //+, -; /; % (modulo)
        //int a = 5 + 5;
        int x = 5;
        int y = 5;
        int z = x + y;
        System.out.println(x + y);

        //FELADAT
        int a = 6;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        /* nem kell annyi szóközt rakni, de szebb, átláthatóbb, rendezés: ctrl + alt + L */

        //Assigment operators
        int aAgain = 5;

        int bAgain;
        bAgain = 10;

        aAgain += bAgain; // ez kevivalens ezzel: aAgain = aAgain + bAgain;
        //=, +=, -=, *=, /=, %= --> ezeknél is használható
        // csak primitíveket tudunk összehasonlítani ==-vel
        // --> egy int 10-es nem lehet összehasonlítani egy string 10-essel (hibát ír)


        //Comparsion operators
        //== --> megvizsgáljuk, hogy egyenlőrek-e,!=, <, >, <=, >=

        boolean isEqual = a == b;
        // isTrue/Equal így szoktuk elnevezni
        boolean isNotEqual = a != b;


       /* változók elnevezése:
       1. camelCase (változóknál)
       2. snake_case (ritkábban használjuk)
       3. PascalCase
        */

        System.out.println();

        //String
        // szöveg tárolására használjuk, összetett adattípus
        String greeting = "Hello PROGMasters";
        //a stringnek vannak metódusai --> hogyan viselkedjen a string osztály
        //greeting. --> kijönnek a metódusai

        System.out.println(greeting.length());
        // ez egy int visszatérésű metódus --> intet fog visszaadni (kiírja, hány karakter hosszú a strang)

        System.out.println(greeting.substring(1));
        //x. karaktertől ír ki

        System.out.println(greeting.substring(6, 10));
        //ezen indexek közötti részt írja ki

        //String konkatenálás
        String again = "Hello";
        System.out.println(greeting + " " + again);

        String againAgain = greeting + " \n \"Hello\"";
        System.out.println(againAgain);

        //Equals --> stringek összehasonlítása
        String firstString = "Hello";
        String secondString = "HelloHello";
        System.out.println(firstString.equals(secondString));


    }
}
