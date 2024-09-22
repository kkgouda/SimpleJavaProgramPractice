import java.util.HashSet;

public class CommonDigitsInTwoArray {
    public static void main(String[] args) {
        int num1[] = {3,4,5,6,2,6,9,0};
        int num2[] = {3,5,2,8,7};

        HashSet<Integer> set = new HashSet<>();
        for(int no1:num1){
            set.add(no1);
        }
        System.out.println("Common numbers are: ");
        HashSet<Integer> commonSet = new HashSet<>();
        for (int no1:num2){
        if(set.contains(no1) && !commonSet.contains(no1)){
            commonSet.add(no1);
            System.out.println(no1+"");
        }
        }
    }

}
