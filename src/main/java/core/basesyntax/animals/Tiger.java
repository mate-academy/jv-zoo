package core.basesyntax.animals;

public class Tiger extends Animal {
    private static final int TIGER_MOVE_POWER_CONSUMPTION = 10;
    private static final int TIGER_MOVE_HEIGHT = 1;

    public Tiger(int initialSatiety) {
        super(initialSatiety);
    }

    @Override
    public int move() {
        if (spendEnergy(TIGER_MOVE_POWER_CONSUMPTION)) {
            return TIGER_MOVE_HEIGHT;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Tiger";
    }
}
