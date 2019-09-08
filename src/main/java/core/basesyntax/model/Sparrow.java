package core.basesyntax.model;

import core.basesyntax.type.Birds;

public class Sparrow extends Birds {
    private String species;

    public Sparrow(String species, boolean canFly) {
        super(species, canFly);
        this.species = species;
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public String toString() {
        return species;
    }
}
