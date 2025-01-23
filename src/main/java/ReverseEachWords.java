public class ReverseEachWords {
    public static void main(String[] args) {
        String wd = "kiran kumar gouda";
        String words[] = wd.split(" ");
        String reverse="";

        for(int i=0;i<words.length;i++){  //for(int i=name.length-1;i>=0;i--)
           String reverseEachWords = new StringBuilder(words[i]).reverse().toString();
           reverse += reverseEachWords + " ";
        }
        System.out.println("Reverse each words are:"+reverse);
    }


}
