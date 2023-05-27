import loclt.application.access_modifiers.AccessPrivateModifiers;

public class MySecondJavaProgram {
    static public void main(String[] args) {
        A a = new A();
    }
}


class A {
    public final int data = 40;
    A(){

    }
    private void msg() {
        System.out.println("Hello java");
    }
}