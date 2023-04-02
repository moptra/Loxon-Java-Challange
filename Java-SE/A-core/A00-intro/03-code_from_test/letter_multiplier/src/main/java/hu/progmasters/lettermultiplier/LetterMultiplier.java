package hu.progmasters.lettermultiplier;

public class LetterMultiplier {

    public static String multiply(String input, int number) {
        if (input == null || input == "" || number < 0) {
            return "Not valid inputs";
        }

        String newWord ="";
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < number; j++) {
                newWord += Character.toString(input.charAt(i));
            }
        }
        return newWord;
    }
}
