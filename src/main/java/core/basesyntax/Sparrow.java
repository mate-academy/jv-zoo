package core.basesyntax;

public class Sparrow extends Animal implements Flyable {
    public Sparrow(String name) {
        super(name);
    }

    @Override
    void feed() {
        System.out.println("Umm? my lovely bugs!");
    }

    public void fly() {
        System.out.println("I'm " + super.name + " and i can fly!");
    }
}
