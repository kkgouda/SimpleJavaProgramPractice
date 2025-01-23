public class ProductPairs {
    public static void main(String[] args) {
        int target =80;

        System.out.println("Pair of number whose product is"+target+":");
        for(int i=1;i<target;i++){
            if(target % i == 0){
                int pair = target/i;
                if(i<=pair){
                    System.out.println(i+ " * "+pair);
                }
            }
        }
    }
}
