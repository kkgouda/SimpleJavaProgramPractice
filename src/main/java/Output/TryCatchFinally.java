package Output;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println("Inside finally");
            throw new RuntimeException("RuntimeException in try");
        }catch (Exception e){

        }finally {
            try {
                System.out.println("Inside finally");
                throw new RuntimeException("RuntimeException in finally");
            }catch (Exception e){

            }
        }

    }

}
