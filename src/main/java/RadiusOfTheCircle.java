import java.util.Scanner;

public class RadiusOfTheCircle {
    void Radius(){

        final double red = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        int r = sc.nextInt();
        double c =(red*r*r);
        System.out.println("Radius value is: "+c);
    }

    public static void main(String[] args) {
        RadiusOfTheCircle rc = new RadiusOfTheCircle();
        rc.Radius();
    }

}
