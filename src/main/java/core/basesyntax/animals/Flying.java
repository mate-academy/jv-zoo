package core.basesyntax.animals;

import java.util.Random;

public interface Flying {
    boolean spendEnergy(int energy);

    int getFlyPowerConsumption();

    int getMaxFlyHeight();

    int getMinFlyHeight();

    default int fly() {
        if (spendEnergy(getFlyPowerConsumption())) {
            int minFlyHeight = getMinFlyHeight();
            return new Random().nextInt(getMaxFlyHeight() - minFlyHeight) + minFlyHeight;
        }
        return 0;
    }
}
