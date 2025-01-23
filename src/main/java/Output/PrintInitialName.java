package Output;
import java.util.Scanner;

public class PrintInitialName{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first name, middle name, and surname
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter middle name: ");
        String middleName = scanner.nextLine();

        System.out.print("Enter surname: ");
        String surname = scanner.nextLine();

        // Get the initials from each name
        String initials = "" + firstName.charAt(0) + middleName.charAt(0) + surname.charAt(0);

        // Convert initials to uppercase and print
        System.out.println("Initials: " + initials.toUpperCase());

        scanner.close();

    }
}
