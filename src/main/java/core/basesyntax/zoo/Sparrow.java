package core.basesyntax.zoo;

public class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("I am flying");
    }

    @Override
    public void feed() {
        System.out.println("I am a "
                + getClass().getSimpleName()
                + " and I would like to eat bread");
    }
}
