public class Constructor {
    Constructor (){
        String name ="Kiran";
        StringBuilder str = new StringBuilder(name);
        String reverse = str.reverse().toString();
        System.out.println(reverse);
    }
    public static void main(String args[]){
        Constructor c = new Constructor();
    }
}
