package core.basesyntax.model;

import core.basesyntax.type.Birds;
import core.basesyntax.type.Swimming;

public class Penguin extends Birds implements Swimming {
    private String species;


    public Penguin(String species, boolean canFly) {
        super(species, canFly);
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println("I like fish!");
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
