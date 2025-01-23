public class VowelsNonVowels {
public static void main(String[] args){
    String sentence = "Kiran Kumar GOUDA";
    sentence = sentence.toLowerCase();
    String vowels="";
    String nonVowels="";
    int vowelCount=0;
    int NonVowelCount=0;
    for(int i=0;i<sentence.length();i++){
        char ch =sentence.charAt(i);
        if(ch == 'a' || ch=='e' || ch=='i' ||ch =='o' || ch=='u'){
            vowels +=ch;
            vowelCount++;
        }else if(ch>='a' && ch<='z'){
            nonVowels +=ch;
            NonVowelCount++;
        }
    }
    System.out.println("Vowels: " +vowels+ ":"+vowelCount);
    System.out.println(("Nonvowels: " +nonVowels+ ":"+NonVowelCount));
}
}

