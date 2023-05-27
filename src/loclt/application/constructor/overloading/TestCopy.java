package loclt.application.constructor.overloading;

public class TestCopy {
    int id;
    String name;
    int age;

    TestCopy(int identified, String n, int a) {
        id = identified;
        name = n;
        age = a;
    }

    TestCopy(TestCopy test) {
        id = test.id;
        name = test.name;
        age = test.age;
    }
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){
        TestCopy s1 = new TestCopy(111,"Karan", 23);
        TestCopy s2 = new TestCopy(s1);
        s1.display();
        s2.display();
        System.out.println(s1.name.equals(s2.name));;

    }
}
