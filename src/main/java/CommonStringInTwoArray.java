import java.util.HashSet;
import java.util.Set;

public class CommonStringInTwoArray {
    public static void main(String[] args) {
        String[] str1 = {"kiran", "kiran", "babu", "Jagu", "Jaju"};
        String[] str2 = {"kiran", "kiran", "ram", "jagu", "prabhu"};

        Set<String> set = new HashSet<>();
        System.out.println("Common names are:");
        for (String wd : str1) {
            set.add(wd);
        }
        for (String wd : str2) {
            if (set.contains(wd)) {
                System.out.print(wd + " ");
            }
       }

    }
}

