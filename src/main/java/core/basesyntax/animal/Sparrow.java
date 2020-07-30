package core.basesyntax.animal;

public class Sparrow extends Bird implements Flyable {
    @Override
    public void feed() {
        System.out.println("Sparrow is eating.");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying.");
    }
}
