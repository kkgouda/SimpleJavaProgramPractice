abstract class Animal {
    abstract void makeSound();
}
 class Dog extends Animal{
    void makeSound(){
        System.out.println("Break");
    }
 }
public class AbstractClassEx {
    public static void main(String[] args) {
      Animal obj = new Dog();
      obj.makeSound();
    }
}