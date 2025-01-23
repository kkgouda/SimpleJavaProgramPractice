public class Eliminate {
    public static void main(String args[]){
        String str = "shjdsSDFD<>%%%32343#@#@";
        //String element = "Lti#$:Mind%$tree";
        // Regular expression to keep only digits
        String s = str.replaceAll("[^a-z,A-Z,0-9]", "");
        System.out.println("After removed:  " + s);
    }
}

