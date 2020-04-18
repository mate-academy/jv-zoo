package core.basesyntax.animals;

public class Shark extends Fish {
    private static final int SHARK_SWIM_POWER_CONSUMPTION = 20;
    private static final int SHARK_MAX_DIVING_DEPTH = 20;
    private static final int SHARK_MIN_DIVING_DEPTH = 1;

    public Shark(int initialSatiety) {
        super(initialSatiety, SHARK_MIN_DIVING_DEPTH,
                SHARK_MAX_DIVING_DEPTH, SHARK_SWIM_POWER_CONSUMPTION);
    }

    @Override
    public String toString() {
        return "Shark";
    }
}
