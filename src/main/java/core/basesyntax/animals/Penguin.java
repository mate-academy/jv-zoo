package core.basesyntax.animals;

public class Penguin extends Bird implements Waterfowl {
    private static final int PENGUIN_FLIGHT_ABILITIES = 0;
    private static final int PENGUIN_SWIM_POWER_CONSUMPTION = 10;
    private static final int PENGUIN_MAX_DIVING_DEPTH = 4;
    private static final int PENGUIN_MIN_DIVING_DEPTH = 1;

    public Penguin(int initialSatiety) {
        super(initialSatiety, PENGUIN_FLIGHT_ABILITIES,
                PENGUIN_FLIGHT_ABILITIES, PENGUIN_FLIGHT_ABILITIES);
    }

    @Override
    public int getSwimPowerConsumption() {
        return PENGUIN_SWIM_POWER_CONSUMPTION;
    }

    @Override
    public int getMaxDivingDepth() {
        return PENGUIN_MAX_DIVING_DEPTH;
    }

    @Override
    public int getMinDivingDepth() {
        return PENGUIN_MIN_DIVING_DEPTH;
    }

    @Override
    public int move() {
        return swim();
    }

    @Override
    public int fly() {
        throw new UnsupportedOperationException("It looks like your penguin fell "
                + "from somewhere high. It was flying for a while, but it’s harmful "
                + "for a penguins to fly. You must pay more attention to the "
                + "situation and how does it happen that your penguin was flying.");
    }

    @Override
    public String toString() {
        return "Penguin";
    }
}
