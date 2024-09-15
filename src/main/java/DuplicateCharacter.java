import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String input = "programming"; // Example input string
        findDuplicateCharacters(input);
    }
    public static void findDuplicateCharacters(String str) {

        Map<Character, Integer> charCountMap = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
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