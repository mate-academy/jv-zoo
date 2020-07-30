package core.basesyntax.aviaries;

import java.util.ArrayList;

public class BirdsAviary<T> {
    public ArrayList<T> birdsAviary = new ArrayList<>();

    public void addToBirdsAviary(T animal) {
        birdsAviary.add(animal);
        System.out.println(animal.toString() + " is added to Birds Aviary");
    }

    public void removeFromBirdsAviary(T animal) {
        birdsAviary.remove(animal);
        System.out.println(animal.toString() + " is removed from Birds Aviary");
    }

    public ArrayList<T> getBirdsAviary() {
        return birdsAviary;
    }
}
