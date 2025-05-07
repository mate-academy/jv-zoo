package core.basesyntax.cages;

import core.basesyntax.animals.Animal;

public class CageForAllAnimal<T extends Animal> {
    private T anyAnimal;

    public void addAnimal(T animal) {
        this.anyAnimal = animal;
    }

    public T getAnimal() {
        return anyAnimal;
    }
}
