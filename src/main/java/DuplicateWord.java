import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {
    public static void main(String[] args) {
       // String sentence = "Sam kiran kiran went went to to to his business";
        String sentence = "kiran KIRAN kumar Gouda GOuda";
        sentence = sentence.toLowerCase();
        // Split the string into words
        String[] words = sentence.split(" ");  // Split by whitespace

        // Use a HashMap to store the frequency of each word
        Map<String, Integer> wordCount = new HashMap<>();

        // Count the frequency of each word
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);

        }

        // Print only the duplicate words
        System.out.println("Duplicate words in the given string are:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {  // Check if the word occurs more than once
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }
    }
}