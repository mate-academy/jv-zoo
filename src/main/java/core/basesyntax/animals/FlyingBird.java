package core.basesyntax.animals;

import core.basesyntax.enums.AnimalClass;
import core.basesyntax.enums.FlyingBirdGenus;

public class FlyingBird extends Animal {

    public FlyingBird(FlyingBirdGenus genus) {
        super(AnimalClass.FLYING_BIRD, genus);
    }

    public String fly() {
        return getGenus() + "flies...";
    }
}
