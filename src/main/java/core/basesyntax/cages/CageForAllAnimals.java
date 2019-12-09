package core.basesyntax.cages;

import core.basesyntax.animal.Animal;

public class CageForAllAnimals<T extends Animal> {
    private T animal;

    public CageForAllAnimals(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return this.animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
