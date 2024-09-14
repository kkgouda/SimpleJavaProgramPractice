public class ReverseString {
    public static void main(String[] args) {
        String str ="Kiran kumar gouda";
        String reverse =" ";
        str = str.toLowerCase();
        for (int i=0;i<str.length();i++){
            reverse =str.charAt(i)+reverse;
        }
        System.out.println("The reverse string is: " +reverse);
    }
}
