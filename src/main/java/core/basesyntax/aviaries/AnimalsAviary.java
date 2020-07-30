package core.basesyntax.aviaries;

import core.basesyntax.animal.Animal;

import javax.naming.CompoundName;
import java.util.ArrayList;
import java.util.List;

public class AnimalsAviary<T> {
    ArrayList<T> aviary;

    public void addToAnimalAviary(T animal) {
        aviary.add(animal);
    }
}
