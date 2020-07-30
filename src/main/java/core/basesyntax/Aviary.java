package core.basesyntax;

import core.basesyntax.animal.Animal;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Aviary<T extends Animal> {
    private Set<T> animals = new HashSet<>();

    public boolean addAnimal(T animal) {
        return animals.add(animal);
    }

    public boolean removeAnimal(T animal) {
        return animals.remove(animal);
    }

    public Set<T> getAnimals() {
        return Collections.unmodifiableSet(animals);
    }
}
