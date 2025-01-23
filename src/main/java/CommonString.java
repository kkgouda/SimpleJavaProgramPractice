import java.util.HashSet;
import java.util.Set;

public class CommonString {
    public static void main(String[] args) {
        String str1="kirlkl";
        String str2="kirujj";
        String str3="kirokh";
        String common="";

        for (char ch:str1.toCharArray()){
             if(str1.indexOf(ch) !=-1 && str2.indexOf(ch)!=-1 && str3.indexOf(ch)!=-1){
                common=common+ch;
            }
        }
        System.out.print("Common characters are :"+common);
    }

}

    // Use a Set to store characters from str1
 /*   Set<Character> com = new HashSet<>();
        for (char name : str1.toCharArray()) {
                com.add(name); // Store characters directly as Character
                }
                for(char name:str2.toCharArray()){
                com.add(name);
                }

                // Check for common characters
                for (char name : str3.toCharArray()) {
                if (com.contains(name)) {
                System.out.print(name);
                com.remove(name); // Optional: Remove to avoid duplicate output
                }
                } */