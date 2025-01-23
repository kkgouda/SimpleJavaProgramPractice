public class SecondHighestNumberOfArray {
    public static void main(String[] args) {

        int [] num = {4,5,6,33,55,88,99};
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for(int numbers:num){
            if(numbers>highest){
                secondHighest = highest;
                 highest = numbers;
            }else if(numbers>secondHighest && numbers !=highest){
                secondHighest=numbers;
            }
        }

            System.out.println("Second largest number from array is: " +secondHighest);
            int[] updatedNum = new int[num.length - 1];
            int index = 0;

            for (int n : num) {
            if (n != secondHighest) {
                updatedNum[index++] = n;
            }
        }

        System.out.println("Array after deleting the second highest number: " + java.util.Arrays.toString(updatedNum));

    }

}
