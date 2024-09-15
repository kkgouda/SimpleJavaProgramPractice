public class sumOfTheDigits {
    public static void main(String[] args) {
        int num =89769;
        int sum =0;
        while (num!=0) // Loop through each digit
        {
            sum +=num%10; // Extract the last digit
            num=num/10; // Remove the last digit
       }
        System.out.println("Sum of the digit is:" + sum);
    }
}
