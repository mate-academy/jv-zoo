package core.basesyntax.aviaries;

import core.basesyntax.animals.Animal;
import java.util.List;

public abstract class Aviary {
    protected List<Animal> animalList;

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public abstract void addAnimal(Animal animal);
}
