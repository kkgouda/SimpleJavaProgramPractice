import java.util.Arrays;
public class ArrayMerge {
    public static void main(String[] args) {
        int a[] = {2,3,4};
        int b[] = {5,6,7};
        int merge[] = new int[a.length+b.length];

        System.arraycopy(a,0,merge,0,a.length);
        System.arraycopy(b,0,merge,a.length,b.length);
        System.out.println(Arrays.toString(merge));
    }
}
