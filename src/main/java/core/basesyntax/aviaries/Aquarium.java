package core.basesyntax.aviaries;

import java.util.ArrayList;

public class Aquarium<T> {
    ArrayList<T> aquarium;

    public void addToAquarium(T animal) {
        aquarium.add(animal);
    }
    public void removeFromAquarium(T animal) {
        aquarium.remove(animal);
    }
}
