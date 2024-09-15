public class WordCount {
    public static void main(String[] args) {
        String str ="Work is god";
        String[] words = str.split(" ");
        int count = words.length;
        System.out.println("Number of words are: " +count);
    }
}
