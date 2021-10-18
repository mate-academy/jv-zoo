package core.basesyntax;

import java.util.ArrayList;

public class Aquarium {
    private ArrayList<Swimmable> animals;

    public Aquarium() {
        animals = new ArrayList<>();
    }

    public ArrayList<Swimmable> getAnimals() {
        return animals;
    }

    public <T extends Animal & Swimmable> void putInAviary(T animal) {
        animals.add(animal);
    }
}
