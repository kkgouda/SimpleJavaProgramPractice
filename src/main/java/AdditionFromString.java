import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdditionFromString {
    public static void main(String[] args) {
        // Input string containing numbers mixed with text
        String input = "125sdsdf25sfs25wdsf";
        // Calculate the sum of numbers in the string
        int sum = calculateSumOfNumbers(input);
        // Print the result
        System.out.println("The sum of numbers in the string is: " + sum);
    }
    // Method to calculate the sum of numbers in the given string
    public static int calculateSumOfNumbers(String str) {
        int sum = 0; // Initialize sum to 0
        // Regular expression to match sequences of digits
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        // Find all matches of numbers in the string
        while (matcher.find()) {
            // Extract the matched number as a string and convert it to an integer
            int number = Integer.parseInt(matcher.group());
            // Add the number to the sum
            sum += number;
        }

        return sum; // Return the calculated sum
    }
}