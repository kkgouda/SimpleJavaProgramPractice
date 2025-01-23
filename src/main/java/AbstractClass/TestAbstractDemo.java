package AbstractClass;

public class TestAbstractDemo {
    public static void main(String[] args) {
        BikeClass obj = new TVS();
        obj.start(); //Non Abstract
        obj.run(); //Abstract
        BikeClass.stop(); //Non Abstract

        obj = new Yamaha();
        obj.start(); //Non Abstract
        obj.run(); //Abstract
        BikeClass.stop(); //Non Abstract

        obj = new Honda();
        obj.start(); //Non Abstract
        obj.run(); //Abstract
        BikeClass.stop(); //Non Abstract

    }
}
