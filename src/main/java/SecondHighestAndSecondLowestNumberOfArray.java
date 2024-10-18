public class SecondHighestAndSecondLowestNumberOfArray {
    public static void main(String[] args) {
        int num[] ={2,3,4,5,6,7,8,9};

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;

        // Loop through the array
        for (int numbers : num) {
            // Check for the highest and second-highest
            if (numbers > highest) {
                secondHighest = highest;
                highest = numbers;
            } else if (numbers > secondHighest && numbers != highest) {
                secondHighest = numbers;
            }
            // Check for the lowest and second-lowest
             if(numbers < lowest){
                secondLowest = lowest;
                lowest = numbers;
            } else if (numbers < secondLowest && numbers != lowest) {
                secondLowest = numbers;
            }
        }
        System.out.println("Second Highest: " + secondHighest);
        System.out.println("Second Lowest: " + secondLowest);
    }
}
