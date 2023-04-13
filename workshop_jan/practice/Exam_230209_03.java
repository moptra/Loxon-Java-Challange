import java.util.Scanner;

public class Exam_230209_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstX = scan.nextInt();
        int firstY = scan.nextInt();

        int secondX = scan.nextInt();
        int secondY = scan.nextInt();

        int triangleASide;
        int triangleBSide;
        int triangleCSide;

        if (firstX > secondX) {
            triangleASide = firstX - secondX;
        } else {
            triangleASide = secondX - firstX;
        }

        if (firstY > secondY) {
            triangleBSide = firstY - secondY;
        } else {
            triangleBSide = secondY - firstY;
        }

        double aPow = Math.pow(triangleASide, 2);
        double bPow = Math.pow(triangleBSide, 2);
        double c = Math.sqrt(aPow + bPow);

        System.out.println(c);
    }
}
