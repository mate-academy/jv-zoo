package core.basesyntax;

import java.util.ArrayList;

public class CageForBirds {
    private ArrayList<Flyable> animals;

    public CageForBirds() {
        animals = new ArrayList<>();
    }

    public ArrayList<Flyable> getAnimals() {
        return animals;
    }

    public <T extends Animal & Flyable> void putInAviary(T animal) {
        animals.add(animal);
    }

}
