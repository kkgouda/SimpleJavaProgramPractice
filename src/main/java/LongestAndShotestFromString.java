public class LongestAndShotestFromString {
    public static void main(String[] args) {
        String word[] = "Sam kiran kiran went went to to to to his business".split(" ");

        String longestWord = word[0];
        String shortestWord = word[0];

        for(String words:word){
            if (words.length() > longestWord.length()) {
                longestWord = words;
            }
           else if (words.length() < shortestWord.length()) {
                shortestWord = words;
            }
        }
        System.out.println("Longest:"+longestWord);
        System.out.println("Shotest:"+shortestWord);
    }
}
