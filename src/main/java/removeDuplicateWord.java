import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateWord {
    public static void main(String[] args) {
        String sen = "Sam kiran kiran went went to to to his business";
        String[] arr = sen.split(" ");
        //arr={Sam,went,went,to,to ,to ,his ,business};
        Set<String> s = new LinkedHashSet<String>();
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);
        }
        for (String ss : s) {
            System.out.print(ss + " ");
        }

    }

}