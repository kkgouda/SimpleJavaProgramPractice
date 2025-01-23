public class AdditionFromStringSingle {
    public static void main(String[] args) {

        String input = "125sdsdf25sfs25wdsf";
        int sum=0;
        for (int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(Character.isDigit(ch)){
                sum += Character.getNumericValue(ch);
            }
        }
        System.out.println("Sum of the digit from string: "+ sum);
    }
}