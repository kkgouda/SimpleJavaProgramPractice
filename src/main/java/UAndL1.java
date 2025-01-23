public class UAndL1 {
    public static void main(String[] args) {
        String word[] = "kiran kumar gouda".split(" ");
        StringBuilder output = new StringBuilder();

        for(String words:word){
            for (int i=0;i<words.length();i++){
                char ch = words.charAt(i);
                if(i % 2 == 0){
                    output.append(Character.toUpperCase(ch));
                }else {
                    output.append(Character.toLowerCase(ch));
                }
            }
            output.append(" ");
        }
        System.out.println(output.toString().trim());
    }
}
