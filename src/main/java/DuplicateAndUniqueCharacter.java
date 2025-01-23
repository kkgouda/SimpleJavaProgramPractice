import java.util.HashMap;
import java.util.Map;

public class DuplicateAndUniqueCharacter {
    public static void main(String[] args) {
        String arr = "programming";
        char name[] = arr.toCharArray();

    Map<Character,Integer> count = new HashMap<>();
    for (char ch :arr.toCharArray() ) {
        count.put(ch,count.getOrDefault(ch,0) + 1);
    }
    System.out.println("Unique characters are:");
    for (Map.Entry<Character, Integer> entry : count.entrySet()) {
        if (entry.getValue() == 1) {
            System.out.print(entry.getKey() + " ");
        }
    }
    System.out.println("\nDuplicate characters are:");
    for (Map.Entry<Character, Integer> entry : count.entrySet()) {
        if (entry.getValue() > 1) {
            System.out.print(entry.getKey() + " ");
         }
       }
    }
}

