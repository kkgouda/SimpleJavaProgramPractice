import java.util.HashSet;

public class CommonCharInTwoArray {
    public static void main(String[] args) {
        String[] arr1 = {"a","b","c","d","e","f","g","h","k"};
        String[] arr2 = {"c","d","e","g","h","k"};
// Create a HashSet to store unique elements from the first array
        HashSet<String> set = new HashSet<>();
        for (String wd:arr1){
            set.add(wd);  // Add each word to the set
        }
       System.out.println("Common words are: ");
        // Use another HashSet to store common elements
        for (String wd:arr2){
            if(set.contains(wd)){
               // Add to commonSet to avoid duplicates
                System.out.print(wd + " ");
            }
        }
    }
}
