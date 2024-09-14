import java.util.HashMap;
import java.util.Map;

public class DuplicateNumber {
       public static void main(String[] args) {
            int[] arr = {3, 3, 4, 5, 6, 7, 7, 8, 8, 8};

            // Use a HashMap to store the frequency of each number
            Map<Integer, Integer> numberCount = new HashMap<>();

            // Count the frequency of each number
            for (int number : arr) {
                numberCount.put(number, numberCount.getOrDefault(number, 0) + 1);
            }

            // Print the duplicate numbers
            System.out.println("Duplicate numbers in the given array are:");
            for (Map.Entry<Integer, Integer> entry : numberCount.entrySet()) {
                if (entry.getValue() > 1) {  // Check if the number occurs more than once
                    System.out.println(entry.getKey());
                }
            }
        }
    }


