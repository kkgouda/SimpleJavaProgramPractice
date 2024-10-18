import java.util.Scanner;

public class AddTwoNumberWithoutUsingAdditionSymbol {

    public static void main(String[] args) {
        int a, b, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        a = sc.nextInt();
        System.out.println("Enter 2nd Number:");
        b = sc.nextInt();
        sum = a- ~b -1;
        System.out.println("Sum of the two digit is: "+sum);
    }
}
