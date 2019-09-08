package core.basesyntax.model;

import core.basesyntax.type.Fishes;

public class Shark extends Fishes {
    private String species;

    public Shark(String species, boolean isPredator) {
        super(species, isPredator);
        this.species = species;
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public String toString() {
        return species;
    }
}
