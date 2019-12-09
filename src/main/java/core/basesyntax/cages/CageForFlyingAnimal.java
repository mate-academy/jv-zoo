package core.basesyntax.cages;

import core.basesyntax.animal.Animal;
import core.basesyntax.types.Flyable;

public class CageForFlyingAnimal<T extends Animal & Flyable> {
    private T animal;

    public CageForFlyingAnimal(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return this.animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

}
