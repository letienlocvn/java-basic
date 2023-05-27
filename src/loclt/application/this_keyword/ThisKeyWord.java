package loclt.application.this_keyword;

public class ThisKeyWord {
    String name;
    int salary;
    ThisKeyWord(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(name + salary);
    }

    public static void main(String[] args) {
        ThisKeyWord keyWord = new ThisKeyWord("Loc", 2000);
        ThisKeyWord keyWord1 = new ThisKeyWord("Hung", 300);
        keyWord.display();
        keyWord1.display();
    }
}


