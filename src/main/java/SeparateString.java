import java.util.ArrayList;
import java.util.List;

public class SeparateString {
    public static void main(String[] args) {
        String[] input = {"Apple", " 12344", "Banana", " 45666", "Orange", " 9876"};

        List<String> names = new ArrayList<>();
        List<Integer> numbers =new ArrayList<>();

        for(String item:input){
            String trimmedItem = item.trim();
            if(trimmedItem.matches("\\d+")) {
                numbers.add(Integer.parseInt(trimmedItem));
            }else {
                names.add(trimmedItem);
            }
        }
        System.out.println("Numbers = " + numbers);
        System.out.println("Names = " + names);
    }
}
