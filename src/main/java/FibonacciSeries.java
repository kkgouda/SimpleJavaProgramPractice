public class
FibonacciSeries {
    public static void main(String[] args) {
        int n = 10, n1 = 0, n2 = 1, n3;

        // Print the first two Fibonacci numbers
        System.out.print("Fibonacci Series: " + n1 + " " + n2);

        // Loop to generate the rest of the Fibonacci series
        for (int i = 2; i < n; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

        System.out.println(); // To move to the next line after printing the series
    }
}
