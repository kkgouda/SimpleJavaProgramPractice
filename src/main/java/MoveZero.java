public class MoveZero {
    public static void main(String[] args) {
        int[] array = {6, 8, 7, 0, 5, 0, 3, 0};
        moveZerosToFront(array);

        // Printing the updated array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void moveZerosToFront(int[] array) {
        int zeroCount = 0;

        // Count the number of zeros
        for (int num : array) {
            if (num == 0) {
                zeroCount++;
            }
        }

        // Fill the array with zeros
        for (int i = 0; i < zeroCount; i++) {
            array[i] = 0;
        }

        // Fill the remaining part of the array with non-zero elements
        int index = zeroCount;
        for (int num : array) {
            if (num != 0) {
                array[index++] = num;
            }
        }

        // Fill the rest of the array with zeros (if any)
        while (index < array.length) {
            array[index++] = 0;
        }
    }
}
