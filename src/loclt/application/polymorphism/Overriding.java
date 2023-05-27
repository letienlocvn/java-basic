package loclt.application.polymorphism;

public class Overriding {
    //Overriding is a parent class.
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Overriding {
    void run() {
        System.out.println("Bike is running safely");
    }
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.run();
    }
}
