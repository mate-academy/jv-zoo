package core.basesyntax;

public class Shark extends Fishes {
    @Override
    public void sayHello() {
        System.out.println("Shark:");
        super.sayHello();
    }
}
