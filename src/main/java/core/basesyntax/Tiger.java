package core.basesyntax;

public class Tiger extends General {
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("Tiger " + getName() + " is fed.");
    }
}
