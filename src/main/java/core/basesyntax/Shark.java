package core.basesyntax;

public class Shark extends Fish {
    @Override
    protected void feed() {
        System.out.println("To feed a shark");
    }

    @Override
    public void swim() {
        System.out.println("I'm a shark and I can swim");
    }
}
