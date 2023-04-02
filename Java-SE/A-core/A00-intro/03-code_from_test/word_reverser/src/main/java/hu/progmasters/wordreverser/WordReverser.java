package hu.progmasters.wordreverser;

public class WordReverser {

    public static String reverse(String input) {
        if (input == "" || input == null) {
            return "Not valid input";
        }

        String newWord = "";
        for (int i = input.length()-1; i >= 0; i--) {
            newWord += Character.toString(input.charAt(i));
        }
        return newWord;
    }
}
