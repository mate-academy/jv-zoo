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

    public void addToWaterHabitat(Swimming animal) {
        waterHabitat.add(animal);
    }

    public void addToAirHabitat(Flying animal) {
        airHabitat.add(animal);
    }

    public void addToLandHabitat(Walking animal) {
        landHabitat.add(animal);
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

    private <E> void printAnimals(List<E> animals) {
        for (E animal : animals) {
            if (animal instanceof Animal) {
                System.out.println(((Animal) animal).getName());
            }
        }
    }

    private <E> void feedAnimals(List<E> animals) {
        for (E animal : animals) {
            if (animal instanceof Animal) {
                ((Animal) animal).feed();
            }
        }
    }

    public void feedAllAnimals() {
        feedAnimals(waterHabitat);
        feedAnimals(landHabitat);
        feedAnimals(airHabitat);
    }

    public void printAllAnimals() {
        printAnimals(waterHabitat);
        printAnimals(landHabitat);
        printAnimals(airHabitat);
    }

    public void allDoSomething() {
        walkersWalk();
        fliersFly();
        swimmersSwim();
    }
}
