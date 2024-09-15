import java.util.Scanner;

public class Palindrome {
    public static void main(String args[])

    {
        String input ;/*="mom";
        System.out.println("My input is: " + input);*/
        String  output="";

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter value: ");
        input = sc.next().toString();
        for (int i=0;i<input.length();i++){
            output=input.charAt(i)+output;
        }
        System.out.println("My reverse order is: " +output);
        if(input.equals(output)==true){
            System.out.println("Its a Palindrome");
        }else{
            System.out.println("Its not a Palindrome");
        }

    }
}


