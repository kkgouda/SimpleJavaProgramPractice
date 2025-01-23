package AbstractClass;

public abstract class BikeClass {
    BikeClass (){

        System.out.println("Bike class created...");
    }
    abstract void run();  //Abstract method

    void start(){ //Non abstract method

        System.out.println("Bike started");
    }
     static void stop(){ //static abstract method

        System.out.println("Bike stopped");
    }

}

