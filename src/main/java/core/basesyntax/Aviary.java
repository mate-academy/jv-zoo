package core.basesyntax;

import core.basesyntax.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Aviary<T extends Animal> {
    private List<T> animals;
    private String name;

    public Aviary(String name) {
        this.name = name;
        animals = new ArrayList<>();
    }

    public int getNumberOfAnimals() {
        return animals.size();
    }

    public void addAnimal(T animal) {
        System.out.format("%s is populated by %s\n", name, animal);
        animals.add(animal);
    }

    public List<T> getAnimals() {
        return animals;
    }
}
