public class RemoveSecondHighestNumbers {
    public static void main(String[] args) {
        int num[] = {2, 3, 4, 5, 6, 7, 8, 9};

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int numbers : num) {
            if (numbers > highest) {
                secondHighest = highest;
                highest = numbers;
            } else if (numbers > secondHighest && numbers != highest) {
                secondHighest = numbers;
            }
        }
        System.out.println("Second Highest: " + secondHighest);
        //Create a new array excluding the second-highest value
        int[] newArray = new int[num.length - 1];
        int index = 0;

        for (int numbers : num) {
            if (numbers != secondHighest) {
                newArray[index++] = numbers;
            }
        }
        // Print the modified array
        System.out.print("Array after removing the second-highest number: ");
        for (int value : newArray) {
            System.out.print(value + " ");

        }
    }
}