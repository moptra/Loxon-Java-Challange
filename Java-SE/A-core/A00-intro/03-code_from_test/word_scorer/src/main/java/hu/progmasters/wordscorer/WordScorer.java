package hu.progmasters.wordscorer;

public class WordScorer {

    public static int evaluate(String input) {

        if (input == null || input == "") {
            return -1;
        }
        char [] consonantArray = {'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u'};
        int numberOfConsonants = 0;

        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < consonantArray.length; j++) {
                if (input.charAt(i) == consonantArray[j]) {
                    numberOfConsonants++;
                }
            }
        }
        int numberOfVowels = input.length() - numberOfConsonants;
        return (numberOfVowels - numberOfConsonants);
    }
}
