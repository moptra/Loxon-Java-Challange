import java.util.Scanner;

public class homePractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = 0;
        if (1 <= a && a <= 1000 && 1 <= b && b <= 1000 ){
            c = a + b;
        }

        System.out.println(c);
    }

}


