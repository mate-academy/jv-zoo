package core.basesyntax.cages;

import core.basesyntax.animal.Animal;
import core.basesyntax.types.Swimmable;

public class CageForSwimmingAnimal<T extends Animal & Swimmable> {
    private T animal;

    public CageForSwimmingAnimal(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return this.animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
