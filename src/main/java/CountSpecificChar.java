public class CountSpecificChar {
    public static void main(String[] args) {
        String name = "kiran kumar kumar gouda";
        char specificChar = 'k';
        int count=0;

        for (int i = 0; i < name.length(); i++){
            if(name.charAt(i) == specificChar){
                count++;
            }
        }
        System.out.println("Count of 'k' is : " +count);
    }
}
