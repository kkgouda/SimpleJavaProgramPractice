import java.util.Scanner;

public class
Armstrong {
    public static void main(String[] args) {
        int num = 153, sum = 0, temp = num;  //9474
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }
        System.out.println(num == sum);
    }
}

    /*int num,sum=0,temp;
    Scanner sc =new Scanner(System.in);
        System.out.println(" Enter numbers:");
                num = sc.nextInt();
                temp = num;

                while (temp!=0){
                int digit = temp%10;
                sum += Math.pow(digit,3);
                temp /=10;
                }
                System.out.println(num==sum);*/
