package core.basesyntax;

import core.basesyntax.abilitiesofanimals.CommonAbilitiesOfAnimals;
import core.basesyntax.abilitiesofanimals.Flyable;

public class Sparrow extends Animal implements CommonAbilitiesOfAnimals, Flyable {
    public Sparrow(String type) {
        super(type);
    }

    @Override
    public void full() {
        System.out.println("Sparrow is full");
    }
}
