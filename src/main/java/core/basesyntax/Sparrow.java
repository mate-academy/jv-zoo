package core.basesyntax;

public class Sparrow extends Birds {
    @Override
    public void sayHello() {
        System.out.println("Sparrow:");
        super.sayHello();
    }
}
