package core.basesyntax.animals;

public class Sparrow extends Bird implements Flying {
    public Sparrow(int initialSatiety) {
        super(initialSatiety);
    }

    @Override
    public int getMinFlyHeight() {
        return 1;
    }

    @Override
    public int getMaxFlyHeight() {
        return 5;
    }

    @Override
    public int getFlyPowerConsumption() {
        return 2;
    }

    @Override
    public int move() {
        return fly();
    }

    @Override
    public String toString() {
        return "Sparrow";
    }
}
