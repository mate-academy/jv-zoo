package core.basesyntax.aviaries;

import java.util.ArrayList;

public class AnimalsAviary<T> {
    ArrayList<T> aviary;

    public void addToAnimalAviary(T animal) {
        aviary.add(animal);
    }
    public void removeFromAnimalAviary(T animal) {
        aviary.remove(animal);
    }
}
