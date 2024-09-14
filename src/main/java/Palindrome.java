import java.util.Scanner;

public class Palindrome {
    public static void main(String args[])

    {
        String input ="kiran";
        System.out.println("My input is: " + input);
        String  output="";
        for (int i=0;i<input.length();i++){
            output=input.charAt(i)+output;
        }
        System.out.println("My output is: " +output);
        if(input.equals(output)==true){
            System.out.println("Its a Palindrome");
        }else{
            System.out.println("Its not a Palindrome");
        }

    }
}


