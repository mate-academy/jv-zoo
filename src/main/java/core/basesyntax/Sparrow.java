package core.basesyntax;

public class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow flies");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow is eating");
    }
}
