public class PrintStartsWith {
    public static void main(String[] args) {
        String[] str = {"kiran", "Kiran", "babu", "gouda"};
        for (String s:str){
            if(s.toLowerCase().startsWith("k")){
                System.out.println(s);
            }
        }
    }
}
