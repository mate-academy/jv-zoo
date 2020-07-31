package core.basesyntax;

public class Penguin extends Bird implements Floating {

    public Penguin(String name) {
        super(name);
    }

    @Deprecated
    public void fly() {
        System.out.println("I can't flying");
    }

    @Override
    public void swim() {
        System.out.println("I'm bird, but i can swimming");
    }
}
