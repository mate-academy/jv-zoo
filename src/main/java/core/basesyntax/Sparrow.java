package core.basesyntax;

public class Sparrow extends Flyable implements Flying {

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    public void feed() {
        System.out.println("Sparrow is eating");
    }

    @Override
    public void act() {
        fly();
    }
}
