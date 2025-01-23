import java.util.Arrays;
import java.util.Collection;

public class ReverseArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 5, 7};
        String reverse="";
        System.out.print("Array in reverse order: ");
        for (int i = originalArray.length - 1; i >= 0; i--){
       // for(int i=0;i<originalArray.length;i++){
            //reverse = originalArray[i]+reverse;
            reverse = reverse+originalArray[i]+" ";
        }
            {
                System.out.println("Reverse order is:"+reverse);
           // System.out.print(originalArray[i] + " ");

        }


    }


}
