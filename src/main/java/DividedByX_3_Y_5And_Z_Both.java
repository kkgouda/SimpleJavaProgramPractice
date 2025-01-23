public class DividedByX_3_Y_5And_Z_Both {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": Z");
            } else if (i % 3 == 0) {
                System.out.println(i + ": X");
            } else if (i % 5 == 0) {
                System.out.println(i + ": Y");
            } else {
                System.out.println(i);
            }
        }
    }
}
