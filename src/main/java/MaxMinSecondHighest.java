import java.util.Arrays;

public class MaxMinSecondHighest {

    public static void main(String[] args) {
        int input[] = {2, 4, 3, 5, 1};
        Arrays.sort(input);

        int lowest = input[0];
        int highest = input[input.length-1];
        int secondHighest = input[input.length-2];

        System.out.println("Highest:"+highest);
        System.out.println("Lowest:"+lowest);
        System.out.println("Second Highest:"+secondHighest);
    }
}
