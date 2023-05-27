package loclt.application;

public class TestDefaultConstructor {
     int age = 0;
     String name;
     public TestDefaultConstructor(int age, String name) {
         System.out.println("Name chosen is: " + age + " " + name);
     }

     public void setAge(int newAge) {
         age = newAge;
     }

     public int getAge() {
         return age;
     }
}
