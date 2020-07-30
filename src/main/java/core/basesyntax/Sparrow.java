package core.basesyntax;

public class Sparrow extends Bird implements Flying{

    @Override
    public void feed() {
        System.out.println("Sparrow is eating");
    }

    @Override
    public void behavior() {
        fly();
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}
