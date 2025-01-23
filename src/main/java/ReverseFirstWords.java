public class ReverseFirstWords {
    public static void main(String[] args) {
      String str = "Kiran Kumar Gouda";
      String []words = str.split(" ");
      String reverseFirstWord="";

      for(int i=0;i<words[0].length();i++){
          reverseFirstWord = words[0].charAt(i)+reverseFirstWord;
      }
        String results = reverseFirstWord + " " + words[1] + " " + words[2];
        System.out.println("Reversed first name: "+results);
    }
}
