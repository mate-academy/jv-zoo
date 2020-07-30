package core.basesyntax.aviaries;

import java.util.ArrayList;

public class BirdsAviary<T> {
    ArrayList<T> birdsAviary;

    public void addToBirdsAviary(T animal) {
        birdsAviary.add(animal);
    }
}
