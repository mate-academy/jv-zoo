package core.basesyntax;

public class Shark extends Animal implements Swimable, Predator {

    public Shark(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("i'm shark and i like penguins!");
    }
}
