public class ThirdHighestNumberOfArray {
    public static void main(String[] args) {
        int []num={5,7,8,9,2,1};
        int highest=Integer.MIN_VALUE;
        int secondHighest=Integer.MIN_VALUE;
        int thirdHighest=Integer.MIN_VALUE;

        for (int numbers:num) {
            if(numbers>highest){
                thirdHighest=secondHighest;
                secondHighest=highest;
                highest=numbers;
            } else if (numbers>secondHighest) {
                thirdHighest=secondHighest;
                secondHighest=numbers;
            } else if (numbers>thirdHighest && numbers !=thirdHighest) {
                thirdHighest=numbers;
            }
        }
           // if(thirdHighest !=Integer.MIN_VALUE){
                System.out.println("Third highest number from array is:"+thirdHighest);
            //}
    }
}
