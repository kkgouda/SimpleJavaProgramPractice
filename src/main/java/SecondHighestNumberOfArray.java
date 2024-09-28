public class SecondHighestNumberOfArray {
    public static void main(String[] args) {

        int [] num = {4,5,6,33,55,88,99};
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;


        for(int numbers:num){
            if(numbers>highest){
                secondHighest = highest;
                 highest = numbers;
            }else if(numbers>secondHighest){
                secondHighest=numbers;
            }
        }
        if(secondHighest !=Integer.MIN_VALUE){
            System.out.println("Second largest number from array is: " +secondHighest);
        }
    }

}
