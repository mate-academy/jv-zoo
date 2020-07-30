package core.basesyntax.aviaries;

import java.util.ArrayList;

public class BirdsAviary<T> {
    ArrayList<T> birdsAviary;

    public void addToBirdsAviary(T animal) {
        birdsAviary.add(animal);
        System.out.println(animal.toString() + " is added to Birds Aviary");
    }
    public void removeFromBirdsAviary(T animal) {
        birdsAviary.remove(animal);
        System.out.println(animal.toString() + " is removed from Birds Aviary");
    }
}
