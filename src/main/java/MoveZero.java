import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {

            int[] array = {6, 8, 7, 0, 5, 0, 3, 0};

            moveZeroesToLeft(array);

            System.out.println("Array after moving zeroes to the left: " + Arrays.toString(array));
        }

        public static void moveZeroesToLeft(int[] array){
            int n = array.length;
            int nonZeroIndex = n - 1;  // Start from the last element

            // Traverse the array from right to left
            for (int i = n - 1; i >= 0; i--) {
                if (array[i] != 0) {
                    array[nonZeroIndex] = array[i];  // Move non-zero elements to the rightmost position
                    nonZeroIndex--;
                }
            }

            // Fill the remaining elements on the left with zeroes
            while (nonZeroIndex >= 0) {
                array[nonZeroIndex] = 0;
                nonZeroIndex--;
            }
        }

}
