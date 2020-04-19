package core.basesyntax;

import core.basesyntax.abilitiesOfAnimals.CommonAbilitiesOfAnimals;
import core.basesyntax.abilitiesOfAnimals.Flyable;

public class Sparrow extends Animal implements CommonAbilitiesOfAnimals, Flyable {
    public Sparrow(String type) {
        super(type);
    }

    @Override
    public void full() {
        System.out.println("Sparrow is full");
    }
}
