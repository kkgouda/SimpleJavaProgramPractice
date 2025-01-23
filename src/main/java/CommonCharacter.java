import java.util.HashSet;
import java.util.Set;
public class CommonCharacter {
    public static void main(String[] args) {
    String name1="kiran kumar gouda";
    String name2="kiran gouda mahankuda";

        Set<String> common = new HashSet<>();

       for(String com:name1.split(" ")){
            common.add(com);
        }
        for(String com:name2.split(" ")){
            if(common.contains(com)){
              System.out.print(com+" ");
            }

        }
    }
}
