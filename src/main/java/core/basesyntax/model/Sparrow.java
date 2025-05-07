package core.basesyntax.model;

import core.basesyntax.type.Bird;
import core.basesyntax.type.Flying;

public class Sparrow extends Bird implements Flying {
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
        System.out.println("I can fly!");
    }

    @Override
    public String toString() {
        return species;
    }
}
