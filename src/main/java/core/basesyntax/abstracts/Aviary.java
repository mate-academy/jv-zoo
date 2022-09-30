package core.basesyntax.abstracts;

import core.basesyntax.abstracts.Animal;
import java.util.List;

public abstract class Aviary {
    protected List<Animal> animalList;

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public abstract void addAnimal(Animal animal);
}