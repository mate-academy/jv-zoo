package core.basesyntax.animals;

import core.basesyntax.enums.AnimalClass;
import core.basesyntax.enums.MammalGenus;

public class Mammals extends Animal {

    public Mammals(MammalGenus genus) {
        super(AnimalClass.MAMMAL, genus);
    }
}
