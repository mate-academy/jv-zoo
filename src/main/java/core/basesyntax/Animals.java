package core.basesyntax;

public abstract class Animals {
    public MovingType movingType;

    public abstract void sayHello();

    public void feed() {
        System.out.println("I'm eating...");
    }
}
