package core.basesyntax.animals;

public abstract class Bird extends Animal implements Flying {
    private int minFlightHeight;
    private int maxFlightHeight;
    private int flyPowerConsumption;

    public Bird(int initialSatiety, int minFlightHeight, int maxFlightHeight, int flyPowerConsumption) {
        super(initialSatiety);
        this.minFlightHeight = minFlightHeight;
        this.maxFlightHeight = maxFlightHeight;
        this.flyPowerConsumption = flyPowerConsumption;
    }

    @Override
    public int move() {
        return fly();
    }

    public int getMinFlyHeight() {
        return minFlightHeight;
    }

    public int getMaxFlyHeight() {
        return maxFlightHeight;
    }

    public int getFlyPowerConsumption() {
        return flyPowerConsumption;
    }
}
