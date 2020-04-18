package core.basesyntax.animals;

public class Sparrow extends Bird {
    private static final int SPARROW_FLY_POWER_CONSUMPTION = 2;
    private static final int SPARROW_MAX_FLIGHT_HEIGHT = 5;
    private static final int SPARROW_MIN_FLIGHT_HEIGHT = 1;

    public Sparrow(int initialSatiety) {
        super(initialSatiety, SPARROW_MIN_FLIGHT_HEIGHT,
                SPARROW_MAX_FLIGHT_HEIGHT, SPARROW_FLY_POWER_CONSUMPTION);
    }

    @Override
    public String toString() {
        return "Sparrow";
    }
}
