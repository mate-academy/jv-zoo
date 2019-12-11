package core.basesyntax;

public class Sparrow extends Bird {
    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("Sparrow " + this.getName() + " is fed.");
    }
}
