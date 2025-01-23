public class StartsWithLatter {
    public static void main(String[] args) {
        String[] str = {"kiran", "Kiran", "babu", "gouda"};
        for (String s:str){
            if(s.startsWith("k")){
                System.out.println(s);
            }
        }
    }
}
