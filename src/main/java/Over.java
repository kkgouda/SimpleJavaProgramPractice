public class Over extends OverrideString  {
    public void divisible2() {
        int[] arr = {1, 2, 3, 5, 6, 7, 9, 12, 15};
        for (int i = 0; i < arr.length; i++)
            if (arr[i] % 3 == 0 && arr[i] > 6) {
                System.out.println(arr[i] + " is divisible by 3 and print grater than 6");
            }

    }
    public static void main(String[] args) {
        Over r = new Over();
        r.divisible1();
        r.divisible2();
    }

}
