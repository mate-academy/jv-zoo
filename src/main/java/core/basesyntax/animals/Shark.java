package core.basesyntax.animals;

public class Shark extends Fish {
    public Shark(int initialSatiety) {
        super(initialSatiety, 1, 20, 20);
    }

    @Override
    public String toString() {
        return "Shark";
    }
}
