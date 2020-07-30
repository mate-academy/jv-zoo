package core.basesyntax.aviaries;

import java.util.ArrayList;

public class AnimalsAviary<T> {
    ArrayList<T> aviary;

    public void addToAnimalAviary(T animal) {
        aviary.add(animal);
        System.out.println(animal.toString() + " is added to Animal Aviary");
    }
    public void removeFromAnimalAviary(T animal) {
        aviary.remove(animal);
        System.out.println(animal.toString() + " is removed from Animal Aviary");
    }
}
