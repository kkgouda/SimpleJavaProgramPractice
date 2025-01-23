import java.util.Stack;

public class GivenStringValidAndInvalidUsingConcatenate {
    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[{}]";
        String s3 = "(]";

        System.out.println("Is s1 valid? " + isValid(s1));  // Output: true
        System.out.println("Is s2 valid? " + isValid(s2));  // Output: true
        System.out.println("Is s3 valid? " + isValid(s3));  // Output: false
    }

    public static boolean isValid(String s) {
        // Stack to store opening brackets
        Stack<Character> stack = new Stack<>();

        // Traverse through the string
        for (char c : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);

            }
            // For closing brackets, check if they match the top of the stack
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                // If no match is found, return false
                return false;
            }
        }

        // If stack is empty at the end, the string is valid
        return stack.isEmpty();
    }
}
