import java.sql.Array;
import java.util.Scanner;

public class SortByNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String words = scan.nextLine();

        String [] wordArray = words.split(" ");
        String[] sortedSentence = new String[wordArray.length];

        for (int i = 0; i < wordArray.length; i++) {
            for (int j = 0; j < wordArray[i].length(); j++) {
                char charNumber = (char)(i + 1);
                if (wordArray[i].charAt(j) == charNumber) {
                    int index = 0;
                    sortedSentence[index] = wordArray[i];
                    index++;
                    break;
                }
            }
        }
        for (int i = 0; i < sortedSentence.length; i++) {
            System.out.print(sortedSentence[i] + " ");
        }

    }
}
