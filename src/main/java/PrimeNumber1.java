public class PrimeNumber1 {
    public static void main(String[] args) {
        int primeCount=0;
        System.out.println("Prime numbers between 1 and 10:");

        for (int num = 1; num <= 10; num++) {
            int count = 0;
            // Check if num is prime
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            // A prime number has only two divisors: 1 and itself
            if (count == 2) {
                System.out.print(num+" ");
                primeCount++;
            }
        }
        System.out.print("\nTotal number of prime numbers between 1 to 10: " + primeCount);
    }
}
