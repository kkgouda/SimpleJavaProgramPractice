import java.util.HashSet;
import java.util.Set;

public class MissingNumberFromArray {
    public static void main(String[] args) {
      int num[] = {3,8,11};
      int min = num[0];
      int max = num [num.length-1];

      Set<Integer> set = new HashSet<>();
      for(int n:num){
          set.add(n);
      }
      System.out.println("Missing numbers are: ");
        for(int i=min;i<=max;i++){
            if(!set.contains(i)){
                System.out.print(i+" ");
            }
        }
    }
}
