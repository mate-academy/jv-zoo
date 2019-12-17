package core.basesyntax;

public class Shark extends Animal implements Swimable, Predator {

    public Shark(String name) {
        super(name);
    }

    @Override
    void feed() {
            System.out.println("i'm shark and i like penguins!");
    }

    @Override
    public void swim() {
        System.out.println("Where is my penguin!");
    }
}
