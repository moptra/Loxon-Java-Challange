import java.util.Scanner;
public class NewTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        int firstIndex = 0;
        int secondIndex = 1;

        for (int i = 0; i < word.length(); i++) {
            if (firstIndex < word.length()) {
                System.out.print(word.charAt(firstIndex));
            }
            if (secondIndex < word.length()) {
                System.out.print(word.charAt(secondIndex));
            }
            firstIndex = firstIndex + 4;
            secondIndex =secondIndex + 4;
            i = i + 3;
        }





/*
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
            i = i + 3;
        }

        for (int j = 1; j < word.length() - 1; j++) {
            System.out.println(word.charAt(j));
            j = j + 3;
        }
*/

    }

    }

