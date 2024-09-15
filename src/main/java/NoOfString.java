import java.util.Scanner;

public class NoOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String input = sc.nextLine();
        int length = input.length();
        System.out.println("Number of character from given string is: "+length);
    }
}
