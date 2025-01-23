public class StartWithNumbers {
    public static void main(String[] args) {
        int num[] = {11,22,33,123,55,11};
        for(int numbers:num){
            if(String.valueOf(numbers).startsWith("1")){
                System.out.print(numbers+ " ");
            }
        }
    }
}
