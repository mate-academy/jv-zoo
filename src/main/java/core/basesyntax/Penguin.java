package core.basesyntax;

public class Penguin extends Animal implements Swimable {

    public Penguin(String name) {
        super(name);
    }

    @Override
    void feed() {
        super.feed();
    }

    @Override
    public void swim() {
        System.out.println("I'm " + super.name + " and i can swim!");
    }
}
