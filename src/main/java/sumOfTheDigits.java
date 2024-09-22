public class sumOfTheDigits {
    public static void main(String[] args) {
        int num =897699;
        int sum =0;

//        int num1 =897699;
//        int numOfDigit = String.valueOf(num1).length();
//        System.out.println("Number of digit is: "+numOfDigit);

        while (num!=0) // Loop through each digit
        {
            sum +=num%10; // Extract the last digit
            num=num/10; // Remove the last digit
       }
        System.out.println("Sum of the digits are:" + sum);
    }
}
