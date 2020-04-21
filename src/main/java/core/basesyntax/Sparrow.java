package core.basesyntax;

public class Sparrow extends Bird implements Flyable {

    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void feedAnimal() {
        System.out.println("Feeding a sparrow");
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
