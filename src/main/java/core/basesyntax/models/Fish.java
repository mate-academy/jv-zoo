package core.basesyntax.models;

import core.basesyntax.interfaces.SwimAbility;

public class Fish extends Animal implements SwimAbility {

    public Fish(String typeOfAnimal) {
        super(typeOfAnimal);
    }

    @Override
    public void showAbility() {
        swim(getTypeOfAnimal());
    }
}
