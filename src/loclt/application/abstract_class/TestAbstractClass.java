package loclt.application.abstract_class;

public class TestAbstractClass {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();
        rectangle.draw();
        circle.draw();
    }
}

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {

    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}