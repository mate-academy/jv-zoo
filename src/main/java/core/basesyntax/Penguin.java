package core.basesyntax;

public class Penguin extends Bird implements Floating {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Bird that can swim");
    }

    @Override
    void feed() {
        System.out.println("Penguin is eating");
    }
}
