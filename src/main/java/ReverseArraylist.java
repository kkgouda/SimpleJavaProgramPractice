import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArraylist {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("AWS");
        myList.add("Java");
        myList.add("Python");
        myList .add("Blockchain");
        System.out.println("Before Reversing::");
        for (String s:myList) {
            System.out.println(s.toLowerCase());
        }
        Collections.reverse(myList);
        System.out.println("After Reversing::");
        for (String s:myList) {
            System.out.println(s.toUpperCase());
        }

    }
}
