public class SeparateCharacters {
    public static void main(String[] args) {
        String input = "shjdsSDFD32343#@#@";

        // StringBuilder to store different types of characters
        StringBuilder lowercaseLetters = new StringBuilder();
        StringBuilder uppercaseLetters = new StringBuilder();
        StringBuilder numericValues = new StringBuilder();
        StringBuilder specialCharacters = new StringBuilder();

        // Iterate over each character in the string
        for (char ch : input.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lowercaseLetters.append(ch);
            } else if (Character.isUpperCase(ch)) {
                uppercaseLetters.append(ch);
            } else if (Character.isDigit(ch)) {
                numericValues.append(ch);
            } else {
                specialCharacters.append(ch);
            }
        }
        System.out.println("Lowercase Letters: " + lowercaseLetters);
        System.out.println("Uppercase Letters: " + uppercaseLetters);
        System.out.println("Numeric Values: " + numericValues);
        System.out.println("Special Characters: " + specialCharacters);
    }
}
