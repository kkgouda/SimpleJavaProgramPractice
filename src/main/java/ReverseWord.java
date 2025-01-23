public class ReverseWord {
    public static void main(String[] args) {
        String wd = "kiran kumar gouda";
        String word[] = wd.split(" ");
        String reverse="";
      //Reverse each word's position
        for(int i=0;i<word.length;i++){
           reverse = " " + word[i] + reverse;
            }
        System.out.println("Reverse words are:"+ reverse);
        }

    }


