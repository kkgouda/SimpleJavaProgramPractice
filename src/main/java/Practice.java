import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;


public class Practice {

        public static void main(String args[]) {
   String a="kiran";
   String b="babu";

   a=a+b;
   b=a.substring(0,a.length()-b.length());
   a=a.substring(b.length());
            System.out.println("after swaping a=" +a+"b="+b);
        }
}
