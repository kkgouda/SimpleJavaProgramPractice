import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        map.remove(102,"Rahul");


       // Elements can traverse in any order
        for (Map.Entry<Integer, String> m : map.entrySet()) {
           System.out.println(m.getKey() + " " + m.getValue());

            //System.out.println(map.get("Amit")); //return null
            //System.out.println(map.get(100)); //return Amit(Get always return key, not value

        }
    }

}