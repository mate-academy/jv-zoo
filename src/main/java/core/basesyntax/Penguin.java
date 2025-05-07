package core.basesyntax;

public class Penguin extends Bird implements Swimable {
    @Override
    public void swim() {
        System.out.println("I'm a penguin and I can swim");
    }

    @Override
    public void feed() {
        System.out.println("To feed a penguin");
    }
}
