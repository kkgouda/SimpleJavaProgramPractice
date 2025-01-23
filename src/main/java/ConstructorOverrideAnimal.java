class ConstructorOverrideAnimal {
    String name;

    // Constructor of parent class
    public ConstructorOverrideAnimal(String name) {
        this.name = name;
        System.out.println("Animal Constructor: " + name);
    }
}

// Child class (Sub Class)
class Cat extends ConstructorOverrideAnimal {
    int age;

    // Constructor of child class
    public Cat(String name, int age) {
        // Call to parent class constructor using super()
        super(name);
        this.age = age;
        System.out.println("Dog Constructor: Name - " + name + ", Age - " + age);
    }
}

class Main {
    public static void main(String[] args) {
        // Creating an object of the Dog class
        Cat cat = new Cat("Buddy", 3);
    }
}