package core.basesyntax.animals.birds;

public class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("I'm Sparrow, I am flying.");
    }

    @Override
    public void eat() {
        System.out.println("I'm Sparrow, I am eating.");
    }
}
