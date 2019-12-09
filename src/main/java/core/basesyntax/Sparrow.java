package core.basesyntax;

public class Sparrow extends Animal implements Flyable {
    public Sparrow(String name) {
        super(name);
    }

    public void fly() {
        System.out.println("I'm " + super.name + " and i can fly!");
    }
}
