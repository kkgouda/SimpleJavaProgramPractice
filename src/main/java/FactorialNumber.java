import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
      int factorial=1;
      int num=5;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number:");
        num= sc.nextInt();

        for(int i=1;i<=num;i++){
            factorial = factorial * i;
        }
        System.out.println("Factorial number is: "+factorial);
    }
}
