import java.util.HashSet;
import java.util.Set;

public class CommonDigitsInTwoArray {
    public static void main(String[] args) {
        int num1[] = {3,4,5,6,2,6,9,0};
        int num2[] = {3,5,2,8,7};
        System.out.println("Common digits are from array:");
        Set<Integer> set = new HashSet<>();
        for (int numbers:num1) {
            set.add(numbers);
        }
        for (int numbers:num2) {
            if(set.contains(numbers)){
                System.out.print(numbers + " ");
            }


        }
    }

}

/* Unique from 2 array
 int num1[] = {3,4,5,6,2,6,9,0};
        int num2[] = {3,5,2,8,7};

        Map<Integer,Integer> uni = new HashMap<>();

        for(int numbers:num1){
            uni.put(numbers,uni.getOrDefault(numbers,0)+1);
        }
        for(int numbers:num2){
            uni.put(numbers,uni.getOrDefault(numbers,0)+1);
        }
        System.out.println("Unique numbers from array:");
        for(Map.Entry<Integer, Integer> entry:uni.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }
 */