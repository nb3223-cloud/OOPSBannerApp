import java.util.HashMap;
import java.util.Map;

public class OOPSBanner {

    // Static inner class to store character and pattern
    static class CharacterPattern {
        char character;
        String[] pattern;

        CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String getLine(int index) {
            return pattern[index];
        }
    }

    public static void main(String[] args) {

        // Map to store patterns
        Map<Character, CharacterPattern> patternMap = new HashMap<>();

        patternMap.put('O', new CharacterPattern('O', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        }));

        patternMap.put('P', new CharacterPattern('P', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*****",
                "*    ",
                "*    ",
                "*    "
        }));

        patternMap.put('S', new CharacterPattern('S', new String[]{
                "*****",
                "*    ",
                "*    ",
                "*****",
                "    *",
                "    *",
                "*****"
        }));

        String word = "OOPS";

        // Print banner
        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                line.append(patternMap.get(c).getLine(i)).append(" ");
            }

            System.out.println(line);
        }
    }
}