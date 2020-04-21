package core.basesyntax.animals;

public class Tiger extends Predator {
    public Tiger(int initialSatiety) {
        super(initialSatiety);
    }

    @Override
    public int move() {
        if (spendEnergy(10)) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Tiger";
    }
}
