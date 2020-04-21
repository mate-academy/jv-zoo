package core.basesyntax.zoo.parts;

import core.basesyntax.animals.Animal;
import core.basesyntax.animals.other.animals.Tiger;
import java.util.ArrayList;

public class Aviary {
    private ArrayList<Animal> list;

    public Aviary() {
        list = new ArrayList<>();
        Animal tiger = new Tiger();
        list.add(tiger);
    }

    public ArrayList<Animal> getAllAnimal() {
        return list;
    }
}
