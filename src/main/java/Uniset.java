import java.util.HashSet;
import java.util.Set;

public class Uniset {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 6};
        int[] b = {4, 5, 6, 7};

        Set<Integer> uni = new HashSet<>();

        for(int j:a)uni.add(j);
        for (int j:b)uni.add(j);
        System.out.println(uni);
    }

}
