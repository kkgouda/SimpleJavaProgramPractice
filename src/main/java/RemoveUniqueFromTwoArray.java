import java.util.HashSet;

public class RemoveUniqueFromTwoArray {
    public static void main(String[] args) {
        String[] arr1 = {"a","b","c","d","e","f","g","h","k"};
        String[] arr2 = {"c","d","e","g","h","k"};
// Create two HashSets to store unique elements of both arrays
        HashSet<String> set1 =new HashSet<>();
        HashSet<String> set2 =new HashSet<>();
        // Add elements of arr1 to set1
        for(String wd1:arr1){
            set1.add(wd1);
        }
        for (String wd2:arr2){
            set2.add(wd2);
        }
        // Create copies of the sets for comparison
        HashSet<String> onlyArr1 =new HashSet<>(set1); // Elements unique to arr1
        HashSet<String> onlyArr2 =new HashSet<>(set2);
        // Remove common elements from each set
        onlyArr1.removeAll(set2); // Elements unique to arr1
        onlyArr2.removeAll(set1);
// Combine the unique elements from both sets
        onlyArr1.addAll(onlyArr2);
        System.out.println("Unique elements are: " + onlyArr1);
    }
}
