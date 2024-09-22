import java.util.Arrays;
import java.util.HashSet;

public class CommonStringInTwoArray {
    public static void main(String[] args) {
        String [] str1={"kiran", "kiran", "babu", "Jagu", "Jaju"};
        String [] str2={"kiran", "kiran", "ram", "hari", "prabhu"};

        HashSet<String> set = new HashSet<>();
        for(String wd:str1){
            set.add(wd);
        }
        System.out.println("Common words are");
        HashSet<String> commonSet = new HashSet<>();
        for (String wd:str2){
            if(set.contains(wd) && !commonSet.contains(wd)){
                commonSet.add(wd);
                System.out.println(wd+" ");
            }
        }

    }
}
