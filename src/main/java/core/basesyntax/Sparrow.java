package core.basesyntax;

public class Sparrow extends Animal implements Flyable {

    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void feedAnimal() {
        System.out.println("Feeding a sparrow");
    }
}
