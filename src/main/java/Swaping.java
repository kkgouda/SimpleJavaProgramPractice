public class Swaping {
    public static void main(String args[]){
//        String A="Kiran";
//        int a = Integer.parseInt(A);
//        String B="Babu";
//        int b = Integer.parseInt(B);
//
//        System.out.println("Before swap A: "+a+ "B: " +b);
//        a = a+b;
//        b = a-b;
//        b = a-b;
//        System.out.println("After swap A: "+a+ "B: " +b);
//
//

        String A = "kiran";
        String B = "babu";

        // Swap without using a third variable
        A = A + B;            // A now holds "kiranbabu"
        B = A.substring(0, A.length() - B.length()); // B now holds "kiran"
        A = A.substring(B.length()); // A now holds "babu"

        System.out.println("A = " + A); // Outputs: A = babu
        System.out.println("B = " + B); // Outputs: B = kiran
    }
}
