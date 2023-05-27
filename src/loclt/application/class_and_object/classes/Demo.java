package loclt.application.class_and_object.classes;

public class Demo {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(12, 16, 1);
        Bicycle bicycle2 = new Bicycle(13, 17, 1);
        Bicycle bicycle3 = new Bicycle(14, 18, 1);
        System.out.println(bicycle.getID() + " - " + Bicycle.numberOfBicycles);
        System.out.println(bicycle2.getID() + Bicycle.numberOfBicycles);
        System.out.println(bicycle3.getID() +Bicycle.numberOfBicycles );
    }
}
