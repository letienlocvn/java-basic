package loclt.application.interface_test;

public class AbstractClassInInterface {

}

interface Remote {
    class ModelHandler {};
    int primeNumber = 0;
    void chanel1();
    void chanel2();
    void chanel3();
    void chanel4();
    abstract void chanelKPlus();

}
class RemoteControl implements Remote {

    @Override
    public void chanel1() {

    }

    @Override
    public void chanel2() {

    }

    @Override
    public void chanel3() {

    }

    @Override
    public void chanel4() {

    }

    @Override
    public void chanelKPlus() {

    }
    public void addKPlusToChanel() {
        System.out.println("add new");
    }
}
abstract class ModelKPlus implements Remote {
}
