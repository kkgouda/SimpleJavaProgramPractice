public class AdditionFromString1 {
    public static void main(String[] args)
    {
// input alphanumeric string
        String str = "26abc04yz1990";
        // A temporary string
        String temp = "0";
        int sum = 0;
        // Read each character in input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // If the current character is a digit
            if (Character.isDigit(ch)) {
                temp += ch;
            }
            // If the current character is an alphabet
            else {
                // Add the number found earlier (if any) to the sum
                sum += Integer.parseInt(temp);
                // Reset the temporary string to empty
                temp = "0";
            }
        }
        // Add the last number (if any) to the sum
        sum += Integer.parseInt(temp);
        // Print the result directly instead of returning it
        System.out.print("Sum of the total is: " + sum);
    }
}


