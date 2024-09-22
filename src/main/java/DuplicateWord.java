import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {
    public static void main(String[] args) {
       // String sentence = "Sam kiran kiran went went to to to his business";
        String sentence = "kiranKIRANkumarGoudaGOuda";
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

//    String str = "fghf jhghjg gjhgh hgjj kiran kumar kumar";
//    String[] words = str.split(" ");
//    Map<String, Integer> wordCount = new HashMap<>();
//  for (String s:words){
//          if(wordCount.containsKey(s)){
//          wordCount.put(s, wordCount.get(s) + 1);
//          }else {
//          wordCount.put(s,1);
//          }
//          }
//          System.out.println(wordCount);
//          }
//          }