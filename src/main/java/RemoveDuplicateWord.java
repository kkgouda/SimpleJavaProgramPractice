import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateWord {
    public static void main(String[] args) {
        String sen = "Sam kiran kiran went went to to to his business 22 44 55 44 22";
        String[] arr = sen.split(" ");
        Set<String> set = new HashSet<>();
        for (String ar:arr) {
            set.add(ar);
        }
        for (String ss : set) {
            System.out.print(ss + " ");
        }

    }

}