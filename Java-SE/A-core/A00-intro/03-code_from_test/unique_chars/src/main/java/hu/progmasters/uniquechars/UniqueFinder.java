package hu.progmasters.uniquechars;

import java.util.ArrayList;

public class UniqueFinder {

    public static Object uniqueChars(String input) {
        ArrayList<Object> charList = new ArrayList<>();

        if (input == null) {
            return "Input was null";
        }

        for (int i = 0; i < input.length(); i++) {
            if (!charList.contains(input.charAt(i))) {
                charList.add(input.charAt(i));
            }
        }

        return charList;
    }
}
