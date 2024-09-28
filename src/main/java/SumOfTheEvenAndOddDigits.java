public class SumOfTheEvenAndOddDigits {
    public static void main(String[] args) {
        int num = 23456789;
        int even =0;
        int odd =0;

        while (num>0){
            int digit = num%10;
            if(digit % 2 ==0){
                even += digit;
            }else {
                odd += digit;
            }
            num= num/10;
        }
        System.out.println("Sum of the even digit:"+even);
        System.out.println("Sum of the odd digit:"+odd);
    }
}
