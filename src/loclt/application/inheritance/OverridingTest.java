package loclt.application.inheritance;

public class OverridingTest {

    public static void main(String[] args) {
        Dog myDog = new Dog();
        Animal myAnimal = myDog;
        // static method hidden in parent class
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
    }

    static class Animal {
        public static void testClassMethod() {
            System.out.println("The static method in Animal");
        }
        public void testInstanceMethod() {
            System.out.println("The instance method in Animal");
        }
    }

    static class Dog extends Animal {

        public static void testClassMethod() {
            System.out.println("The static method in Dog");
        }
        public void testInstanceMethod() {
            System.out.println("The instance method in Dog");
        }
    }


}
