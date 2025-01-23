import java.util.Arrays;

public class StringAscendingOrderLastDigit {
    public static void main(String[] args) {
        // Input string
        String label = "like2 work4 my3 l1";

        // Split the string into individual words
        String[] words = label.split(" ");

        // Sort the words based on the number in each word
        Arrays.sort(words, (a, b) -> {
            // Extract numbers from the words
            int numA = extractNumber(a);
            int numB = extractNumber(b);
            return numA - numB; // Sort in ascending order
        });

        // Join the sorted words into a single string
        String result = String.join(" ", words);

        // Print the result
        System.out.println("Sorted output: " + result);
    }

    // Helper method to extract number from a word
    private static int extractNumber(String word) {
        // Use a regular expression to extract the number from the word
        String num = word.replaceAll("[^0-9]", "");
        return num.isEmpty() ? 0 : Integer.parseInt(num);
    }
}

/*
 String num1[] = "like2 work4 my3 l1".split(" ");
        for (int i=0;i<num1.length;i++){
           Arrays.sort(num1);
        }
        System.out.println(Arrays.toString(num1));
 */