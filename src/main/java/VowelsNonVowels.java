public class VowelsNonVowels {
public static void main(String[] args){
    String sentence = "Kiran Kumar GOUDA";
    sentence = sentence.toLowerCase();
    String vowels="";
    String nonVowels="";
    for(int i=0;i<sentence.length();i++){
        char ch =sentence.charAt(i);
        if(ch == 'a' || ch=='e' || ch=='i' ||ch =='o' || ch=='u'){
            vowels +=ch;
        }else if(ch>='a' && ch<='z'){
            nonVowels +=ch;
        }
    }
    System.out.println("Vowels: "+vowels);
    System.out.println(("Nonvowels: "+nonVowels));
}
}

