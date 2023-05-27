package loclt.application.this_keyword;

public class InvokeCurrentClassMethod {
    String name;
    int salary;

    InvokeCurrentClassMethod(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void method1() {
        System.out.println("Method 1:  "+name + salary);
    }

    void method2() {
        System.out.println("Method 2: "+name + salary);
    }
    void callMethodDisPlay(){
        this.method2();
    }

    public static void main(String[] args) {
        InvokeCurrentClassMethod invoke = new InvokeCurrentClassMethod("Loc", 2000);
        invoke.callMethodDisPlay();
    }
}
