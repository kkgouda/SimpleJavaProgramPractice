import java.util.HashMap;
import java.util.Map.Entry;
public class Map {
    public static void main(String args[]) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        map.remove(102,"Rahul");

        //Elements can traverse in any order
        for (java.util.Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());

        }
    }

}