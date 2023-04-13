
import java.util.*;

public class SortDeck {
    public static void main(String[] args) {

        String reference = "A23456789TJQK";

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().replaceAll(" ", "");

        for (int i = 0; i < reference.length(); i++) {
            for (int j = 0; j < input.length(); j++) {
                if (reference.charAt(i) == (input.charAt(j))) {
                    System.out.print(reference.charAt(i) + " ");
                }
            }
        }
    }
}

