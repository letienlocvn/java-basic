package loclt.application.abstract_class;

public class TestWithinInterface {
    public static void main(String[] args) {
        IPhone iphone8 = new IPhone8();
        IPhone iphone14_version1 = new IPhone14();
        iphone8.call();
        IPhone14 iPhone14_version2 = new IPhone14();
        iphone14_version1.checkPhone();
        iPhone14_version2.takeAPicture();

        Nokia nokia2850 = new Nokia2850();
        nokia2850.checkPhone();
        nokia2850.call();
        nokia2850.textMessage();
        nokia2850.internet();
    }

}

interface Mobile {
    void call();
    void textMessage();
    void internet();
}

abstract class IPhone implements Mobile {
    public void checkPhone() {
        System.out.println("Im Iphone");
    }

    public abstract void iCloud();
}

abstract class Nokia implements Mobile {
    public void checkPhone() {
        System.out.println("Im Nokia");
    }
}

class Nokia2850 extends Nokia {

    @Override
    public void call() {
        System.out.println("Nokia is calling");
    }

    @Override
    public void textMessage() {
        System.out.println("Nokia is sending message");
    }

    @Override
    public void internet() {
        System.out.println("Nokia is trying to connect with 4G");
    }
}

class IPhone8 extends IPhone {

    public void call() {
        System.out.println("IPhone 8 is calling");
    }

    public void textMessage() {
        System.out.println("IPhone 8 is sending message");
    }

    public void internet() {
        System.out.println("IPhone 8 is trying to connect");
    }

    @Override
    public void iCloud() {
        System.out.println("IPhone 14 Icloud");
    }
}
class IPhone14 extends IPhone {

    public void takeAPicture() {
        System.out.println("IPhone 14 is taking a picture");
    }
    public void call() {
        System.out.println("IPhone 8 is calling");
    }

    public void textMessage() {
        System.out.println("IPhone 8 is sending message");
    }

    public void internet() {
        System.out.println("IPhone 8 is trying to connect");
    }

    @Override
    public void iCloud() {
        System.out.println("IPhone 8 Icloud");
    }
}