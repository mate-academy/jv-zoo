package core.basesyntax;

public class Sparrow extends Bird implements Flyable {
    @Override
    public void feed() {
        System.out.println("To feed a sparrow");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow can fly");
    }
}
