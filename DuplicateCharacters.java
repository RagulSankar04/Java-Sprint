
import java.util.*;

public class DuplicateCharacters {

    public static void main(String[] args) {
        String str = "Programming";
        str = str.replaceAll("\\s", "");
        str = str.toLowerCase();

        char[] chars = str.toCharArray();

        Map<Character, Integer> charCount = new HashMap();

        for (char c : chars) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        System.out.println("Duplicate Characters: ");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " => " + entry.getValue() + " times");
            }
        }
    }
}
