package core.basesyntax.model;

import core.basesyntax.type.Bird;
import core.basesyntax.type.Swimming;

public class Penguin extends Bird implements Swimming {
    private String species;


    public Penguin(String species, boolean canFly) {
        super(species, canFly);
        this.species = species;
    }

    @Override
    public void swim() {
        System.out.println("I can swim!");
    }

    @Override
    public void eat() {
        System.out.println("I like fish!");
    }

    @Override
    public String toString() {
        return species;
    }


}
