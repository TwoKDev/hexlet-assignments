package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String symbolsText, String word) {
        if (symbolsText.length() == 0) {
            return false;
        }

        List<Character> symbols = new ArrayList<>();
        for (var character : symbolsText.toCharArray()) {
            symbols.add(Character.toLowerCase(character));
        }

        for (var i = 0; i < word.length(); i += 1) {
            var character = Character.toLowerCase(word.charAt(i));
            var charIndex = symbols.indexOf(character);
            if (!symbols.contains(character)) {
                return false;
            }
            symbols.remove(charIndex);
        }

        return true;
    }
}
// END
