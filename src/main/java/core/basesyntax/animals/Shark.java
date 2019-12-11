package core.basesyntax.animals;

public class Shark extends Fish {

    @Override
    public void feed() {
        System.out.println("I'm Shark and i eat fish.");
    }

    @Override
    public void swim() {
        System.out.println("I'm Shark and I'm swimming");
    }
}
