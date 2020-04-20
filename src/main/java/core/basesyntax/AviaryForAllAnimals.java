package core.basesyntax;

import core.basesyntax.model.Animal;

public class AviaryForAllAnimals<T extends Animal> {
    private T animal;

    public AviaryForAllAnimals(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
