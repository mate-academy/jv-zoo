package core.basesyntax.animals;

import core.basesyntax.enums.AnimalClass;
import core.basesyntax.enums.FishGenus;

public class Fish extends Animal {

    public Fish(FishGenus genus) {
        super(AnimalClass.FISH, genus);
    }

    public String swim() {
        return getGenus() + "плавает.";
    }
}
