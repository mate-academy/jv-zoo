package core.basesyntax.model;

import core.basesyntax.type.Fish;

public class Shark extends Fish {
    private String species;

    public Shark(String species, boolean isPredator) {
        super(species, isPredator);
        this.species = species;
    }

    @Override
    public void swim() {
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
