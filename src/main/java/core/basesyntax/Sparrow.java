package core.basesyntax;

public class Sparrow extends Bird implements Flying {

    public Sparrow(String name) {
        super(name);
    }

    @Override
    void feed() {
        System.out.println("Sparrow is eating");
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Sparrow is flying");
    }
}
