import java.util.*;

public class TwoArraySort {
    public static void main(String[] args) {
        int arr1[] = {1,2,34,5,6,5,7};
        int arr2[] = {32,3,2,12};


        List<Integer> all = new ArrayList<>();
        //Set<Integer> all = new HashSet<>();
        for(int numbers:arr1) {
           // if (numbers % 2 != 0) { // Check if the number is odd
                all.add(numbers);
            }
       // }
        for(int numbers:arr2){
         //   if (numbers % 2 != 0) { // Check if the number is odd
                all.add(numbers);
            }
      //  }
        //List<Integer> alla = new ArrayList<>(all);
        Collections.sort(all,Collections.reverseOrder());
        System.out.println(all);

        Collections.sort(all);
        System.out.println(all);

        /*for(int i=0;i<all.size()-1;i++){
            for(int j=0;j<all.size()-1;j++){
                if(all.get(j)<all.get(j+1)){
                    int temp = all.get(j);
                    all.set(j, all.get(j + 1));
                    all.set(j + 1, temp);
                }
            }
        }
        System.out.println("Sorted List in Ascending Order: " + all);*/


    }
}
