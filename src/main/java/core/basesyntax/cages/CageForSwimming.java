package core.basesyntax.cages;

import core.basesyntax.behavior.Swimable;

public class CageForSwimming<T extends Swimable> {
    private T swimableAnimal;

    public void addAnimal(T animal) {
        this.swimableAnimal = animal;
    }

    public T getAnimal() {
        return swimableAnimal;
    }
}
