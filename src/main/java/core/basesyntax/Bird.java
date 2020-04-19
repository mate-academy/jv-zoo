package core.basesyntax;

public abstract class Bird extends Animal implements Flyable {
    public Bird(String name, int age) {
        super(name, age);
    }
}
