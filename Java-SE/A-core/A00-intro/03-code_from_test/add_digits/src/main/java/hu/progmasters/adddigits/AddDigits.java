package hu.progmasters.adddigits;

import java.sql.Array;

import static java.lang.Integer.parseInt;

public class AddDigits {

    public static int addDigits(String word) {

        int sum = 0;

        if (word == null || word == "") {
            return -1;
        }

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);

            if (Character.isDigit(letter)) {
                sum += Character.getNumericValue(word.charAt(i));
            }
        }
        return sum;
    }
}


