package core.basesyntax.animals;

public abstract class Fish extends Animal implements Waterfowl {
    private int minDivingDepth;
    private int maxDivingDepth;
    private int swimPowerConsumption;

    public Fish(int initialSatiety, int minDivingDepth,
                int maxDivingDepth, int swimPowerConsumption) {
        super(initialSatiety);
        this.minDivingDepth = minDivingDepth;
        this.maxDivingDepth = maxDivingDepth;
        this.swimPowerConsumption = swimPowerConsumption;
    }

    @Override
    public int move() {
        return swim();
    }

    @Override
    public int getMaxDivingDepth() {
        return maxDivingDepth;
    }

    @Override
    public int getMinDivingDepth() {
        return minDivingDepth;
    }

    @Override
    public int getSwimPowerConsumption() {
        return swimPowerConsumption;
    }
}
