package core.basesyntax;

public class Sparrow extends Bird implements Flyable {
    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("I love worms");
    }

    @Override
    public void fly() {
        System.out.println("I believe I can flyyyy... ");
    }
}
