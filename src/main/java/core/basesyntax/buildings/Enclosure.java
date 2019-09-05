package core.basesyntax.buildings;

import core.basesyntax.animals.Tiger;
import java.util.ArrayList;
import java.util.List;

public class Enclosure<T extends Tiger> {
    List<T> list = new ArrayList<T>();

    public Enclosure() {
    }

    public T getAnimal(T animal) {
        list.remove(animal);
        return animal;
    }

    public void setAnimal(T animal) {
        list.add(animal);
    }
}
