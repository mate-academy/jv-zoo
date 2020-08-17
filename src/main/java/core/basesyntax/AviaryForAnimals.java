package core.basesyntax;

import java.util.ArrayList;

public class AviaryForAnimals {
    private ArrayList<Landy> animals;

    public AviaryForAnimals() {
        animals = new ArrayList<>();
    }

    public ArrayList<Landy> getAnimals() {
        return animals;
    }

    public <T extends Animal & Landy> void putInAviary(T animal) {
        animals.add(animal);
    }
}
