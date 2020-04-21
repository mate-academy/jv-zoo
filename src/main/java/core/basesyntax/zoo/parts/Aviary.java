package core.basesyntax.zoo.parts;

import core.basesyntax.animals.Animal;
import java.util.ArrayList;

public class Aviary {
    private ArrayList<Animal> list;

    public Aviary() {
        list = new ArrayList<>();
    }

    public ArrayList<Animal> getAllAnimal() {
        return list;
    }

    public void putAnimal(Animal animal) {
        list.add(animal);
    }
}
