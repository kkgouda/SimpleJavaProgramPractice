import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Uniset {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 6};
        int[] b = {4, 5, 6, 7};

        Set<Integer> uni = new HashSet<>();

        /*List<Integer> all = new ArrayList<>();
        for(int j:a)all.add(j);
        for (int j:b)all.add(j);*/

        for(int j:a)uni.add(j);
        for (int j:b)uni.add(j);
        System.out.println(uni);
        //System.out.println(all);
    }

}
