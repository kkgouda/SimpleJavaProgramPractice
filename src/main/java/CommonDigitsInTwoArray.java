import java.util.HashSet;

public class CommonDigitsInTwoArray {
    public static void main(String[] args) {
        int num1[] = {3,4,5,6,2,6,9,0};
        int num2[] = {3,5,2,8,7};
        System.out.println("Common digits are from array:");
        HashSet<Integer> set = new HashSet<>();
        for (int numbers:num1) {
            set.add(numbers);
        }
        for (int numbers:num2) {
            if(set.contains(numbers));{
                System.out.println(numbers + " ");
            }
        }
    }

}

