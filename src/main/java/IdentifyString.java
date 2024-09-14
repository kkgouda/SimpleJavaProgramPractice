import java.util.HashSet;
import java.util.Set;

public class IdentifyString {
   public static void main(String[] args) {
        String input = "Hello World! 123";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);


            if (Character.isUpperCase(ch)) {
                System.out.println(ch + " is an uppercase letter.");
            } else if (Character.isLowerCase(ch)) {
                System.out.println(ch + " is a lowercase letter.");
            } else if (Character.isDigit(ch)) {
                System.out.println(ch + " is a digit.");
            } else if (Character.isWhitespace(ch)) {
                System.out.println(ch + " is a whitespace character.");
            } else {
                System.out.println(ch + " is a special character.");
            }
        }
    }
}