package loclt.application.constructor.overloading;

public class TestOverLoading {
    int id;
    String name;
    int age;

    TestOverLoading(int identified, String n) {
        id = identified;
        name = n;
    }

    TestOverLoading(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }
    TestOverLoading() {

    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]){
        TestOverLoading s1 = new TestOverLoading(111,"Karan");
        TestOverLoading s2 = new TestOverLoading(222,"Aryan",25);
        s1.display();
        s2.display();
    }
}
