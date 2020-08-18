package core.basesyntax;

import core.basesyntax.abstractclasses.Animal;
import core.basesyntax.interfaces.Flying;
import core.basesyntax.interfaces.Swimming;
import core.basesyntax.interfaces.Walking;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Flying> airHabitat = new ArrayList<>();
    private List<Swimming> waterHabitat = new ArrayList<>();
    private List<Walking> landHabitat = new ArrayList<>();
    private List<Animal> allAnimals = new ArrayList<>();

    public <T extends Animal & Swimming> void addToWaterHabitat(T animal) {
        waterHabitat.add(animal);
        allAnimals.add(animal);
    }

    public <T extends Animal & Flying> void addToAirHabitat(T animal) {
        airHabitat.add(animal);
        allAnimals.add(animal);
    }

    public <T extends Animal & Walking> void addToLandHabitat(T animal) {
        landHabitat.add(animal);
        allAnimals.add(animal);
    }

    private void walkersWalk() {
        for (Walking walker : landHabitat) {
            walker.walk();
        }
    }

    private void swimmersSwim() {
        for (Swimming swimmer : waterHabitat) {
            swimmer.swim();
        }
    }

    private void fliersFly() {
        for (Flying flier : airHabitat) {
            flier.fly();
        }
    }

    public <T extends Animal> void printAnimals(List<T> animals) {
        for (T animal : animals) {
            System.out.println(animal.getName());
        }
    }

    public <T extends Animal> void feedAnimals(List<T> animals) {
        for (T animal : animals) {
            animal.feed();
        }
    }

    public List<Animal> getAllAnimals() {
        return allAnimals;
    }

    public void allDoSomething() {
        walkersWalk();
        fliersFly();
        swimmersSwim();
    }
}
