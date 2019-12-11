package core.basesyntax;

public class Shark extends Fish {
    public Shark(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("Shark " + this.getName() + " is fed.");
    }
}
