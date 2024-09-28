import java.util.HashMap;
import java.util.Map;

public class DuplicateAndUniqueCharacter {
    public static void main(String[] args) {
        String str = "programming";
        findDuplicateAndUniqueCharacter(str);
    }
public static void findDuplicateAndUniqueCharacter(String str){
    Map<Character,Integer> count = new HashMap<>();
    for (char ch : str.toCharArray()) {
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

