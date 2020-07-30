package core.basesyntax.animalkind;

import core.basesyntax.animaltype.Fish;
import core.basesyntax.interfaces.ISwimmable;

public class Shark extends Fish implements ISwimmable {
    private String name;

    public Shark(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void eat() {
        System.out.println("Shark: Very taste meat!");
    }

    @Override
    public void swim() {
        System.out.println("Time for Sharks swim!");
    }
}
