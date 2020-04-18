package core.basesyntax;

public class Shark extends Fish {

    public Shark(String name) {
        super(name);
    }

    @Override
    public void swimable() {
        System.out.println("Swimming...");
    }

    @Override
    public void feed() {
        System.out.println("I want fish!");
    }
}
