import java.util.HashMap;
import java.util.Map;

public class OOPSBanner {

    public static void main(String[] args) {

        // HashMap to store character patterns
        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        });

        patternMap.put('P', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*****",
                "*    ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                "*****",
                "*    ",
                "*    ",
                "*****",
                "    *",
                "    *",
                "*****"
        });

        String word = "OOPS";

        // Print banner using nested loops
        for (int i = 0; i < 7; i++) {

            for (char ch : word.toCharArray()) {
                System.out.print(patternMap.get(ch)[i] + " ");
            }

            System.out.println();
        }
    }
}