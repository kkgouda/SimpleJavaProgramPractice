class SuperMethod{
    void eat(){
        System.out.println("eating...");
    }
}
class SuperMethod1 extends SuperMethod{

    void eat(){
        System.out.println("eating bread...");
    }
    void bark(){
        System.out.println("barking...");
    }
    void work(){
        super.eat();
        //bark();
    }
}
class TestSuper2{
    public static void main(String args[]){
        SuperMethod1 obj =new SuperMethod1();
        obj.work();
    }}