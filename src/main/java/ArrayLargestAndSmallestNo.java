public class ArrayLargestAndSmallestNo {
    public static void main(String[] args) {
        int [] num = {66,90,100,8,9,0};
        int max = num[0];
        int low = num[0];
        for (int i=0;i<num.length;i++){
            if(num[i]>max){
                max =num[i];
            } else if (num[i]<low) {
                low=num[i];
            }
        }
        System.out.println("Largest number of array is: "+ max);
        System.out.println("Largest number of array is: "+ low);

    }
}
