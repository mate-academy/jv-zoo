package core.basesyntax.aviaries;

import java.util.ArrayList;

public class Aquarium<T> {
    public ArrayList<T> aquarium = new ArrayList<>();

    public void addToAquarium(T animal) {
        aquarium.add(animal);
        System.out.println(animal.toString() + " is added to Aquarium");
    }

    public void removeFromAquarium(T animal) {
        aquarium.remove(animal);
        System.out.println(animal.toString() + " is removed from Aquarium");
    }

    public ArrayList<T> getAquarium() {
        return aquarium;
    }
}
