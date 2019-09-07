package core.basesyntax.buildings;

import core.basesyntax.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Cage<T extends Animal> {
    List<T> list = new ArrayList<T>();

    public void add(T animal) {
        list.add(animal);
    }

    public void giveEat(T animal) {
        int id = list.indexOf(animal); {
            if (id != -1) {
                Animal getAnimal = list.get(id);
                getAnimal.eat();
            }
        }
    }

    public void remove(T animal) {
        list.remove(animal);
    }
}
