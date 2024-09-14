public class Eliminate {
    public static void main(String args[]){
        String element = "shjdsSDFD<>%%%32343#@#@";
        // Regular expression to keep only digits
        String s = element.replaceAll("[^a-z,A-Z,0-9]", " ");
        System.out.println("remove: " + s);
    }
}

