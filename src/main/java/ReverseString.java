import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String str="kiran kumar gouda";
        String reverse =" ";
        //String str;
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter number: ");
        //str = sc.next().toString().toLowerCase();
        str = str.toLowerCase();
        for (int i=0;i<str.length();i++){
            reverse =str.charAt(i)+reverse;
        }
       System.out.println("The reverse string is: " +reverse);

    }
}
