// 1. super is used to refer immediate parent class instance variable
public class SuperVariable {
    String color="white";
}
class Me extends SuperVariable {
     void color() {
        String color = "Black";
        System.out.println(color);
        System.out.println(super.color);
    }
}
class TestSuper{
    public static void main(String[] args) {
        Me obj = new Me();
        obj.color();
    }
}



