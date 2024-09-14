import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SimpleArrayList {
    public static void main(String args[]){
        //ArrayList<String> list =new ArrayList<String>();
        ArrayList<String> list=new ArrayList<String>();

        list.add("Lucky");
        list.add("Kiran");
        list.add("Pinky");
        list.add("sri");
       // Collections.sort(list);

        for (String all:list) {
            System.out.println(all);

        }

    }
}
