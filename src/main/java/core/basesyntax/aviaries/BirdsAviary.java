package core.basesyntax.aviaries;

import java.util.ArrayList;

public class BirdsAviary<T> {
    ArrayList<T> birdsAviary;

    public void addToBirdsAviary(T animal) {
        birdsAviary.add(animal);
    }
    public void removeFromBirdsAviary(T animal) {
        birdsAviary.remove(animal);
    }
}
