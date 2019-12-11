package core.basesyntax.cages;

import core.basesyntax.behavior.Flyable;

public class CageForFlying<T extends Flyable> {
    private T flyingAnimal;

    public void addAnimal(T animal) {
        flyingAnimal = animal;
    }

    public T getAnimal() {
        return flyingAnimal;
    }
}
