package core.basesyntax.animals;

import core.basesyntax.enums.AnimalClass;

public class FloatingBird extends Animal {

    public FloatingBird(Enum genus) {
        super(AnimalClass.FLOATING_BIRD, genus);
    }

    public String swim() {
        return getGenus() + "floats...";
    }
}
