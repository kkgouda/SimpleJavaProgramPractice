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
        System.out.println("Common characters are :"+common);
    }

}
