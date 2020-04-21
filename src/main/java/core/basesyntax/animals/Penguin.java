package core.basesyntax.animals;

public class Penguin extends Bird implements Waterfowl {
    public Penguin(int initialSatiety) {
        super(initialSatiety);
    }

    @Override
    public int getSwimPowerConsumption() {
        return 10;
    }

    @Override
    public int getMaxDivingDepth() {
        return 4;
    }

    @Override
    public int getMinDivingDepth() {
        return 1;
    }

    @Override
    public int move() {
        return swim();
    }

    @Override
    public String toString() {
        return "Penguin";
    }
}
