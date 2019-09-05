package core.basesyntax.buildings;

import core.basesyntax.animals.Fishes;

import java.util.ArrayList;
import java.util.List;

public class Aquarium<T extends Fishes> {
    List<T> list = new ArrayList<T>();

    public Aquarium() {
    }

    public T getAnimal(T animal) {
        list.remove(animal);
        return animal;
    }

    public void setAnimal(T animal) {
        list.add(animal);
    }
}
