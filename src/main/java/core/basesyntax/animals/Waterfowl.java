package core.basesyntax.animals;

import java.util.Random;

public interface Waterfowl {
    boolean spendEnergy(int energy);

    int getSwimPowerConsumption();

    int getMaxDivingDepth();

    int getMinDivingDepth();

    default int swim() {
        if (spendEnergy(getSwimPowerConsumption())) {
            int minDivingDepth = getMinDivingDepth();
            return -minDivingDepth - new Random().nextInt(getMaxDivingDepth() - minDivingDepth);
        }
        return 0;
    }
}
