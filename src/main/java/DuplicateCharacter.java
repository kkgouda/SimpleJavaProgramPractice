import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {
    public static void main(String[] args) {
        char[] input = "programming".toCharArray(); // Example input string

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : input) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);

        }

        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());

            }

        }
    }
}