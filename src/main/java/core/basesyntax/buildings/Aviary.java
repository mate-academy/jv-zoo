package core.basesyntax.buildings;

import core.basesyntax.animals.Birds;

import java.util.ArrayList;
import java.util.List;

public class Aviary<T extends Birds> {
    List<T> list = new ArrayList<T>();

    public Aviary() {
    }

    public T getAnimal(T animal) {
        list.remove(animal);
        return animal;
    }

    public void setAnimal(T animal) {
        list.add(animal);
    }
}
