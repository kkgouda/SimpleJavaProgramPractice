public class ArrayLargestAndSmallestNo {
    public static void main(String[] args) {
        int[] num = {66, 90, 100, 8, 9, 0};
        int max = num[0];
        int low = num[0];
        for (int numbers : num) {
            if (numbers > max) {
                max = numbers;
            } else if (numbers < low) {
                low = numbers;
            }
        }
        System.out.println("Largest number of array is: "+ max);
        System.out.println("Largest number of array is: "+ low);
    }
}
