import java.util.LinkedList;

public class SimpleLinkedList {
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<String>();
        list.add("a");
        list.add("e");
        list.add("i");
        list.add("o");
        list.add("u");
        list.remove("a");

        for (String vowels:list) {
            System.out.println(vowels);
        }
    }
}

