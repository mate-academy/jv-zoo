package core.basesyntax;

import core.basesyntax.abstractclasses.Animal;
import core.basesyntax.interfaces.Flies;
import core.basesyntax.interfaces.Swims;
import core.basesyntax.interfaces.Walks;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Flies> airHabitat = new ArrayList<>();
    private List<Swims> waterHabitat = new ArrayList<>();
    private List<Walks> landHabitat = new ArrayList<>();

    public void addToWaterHabitat(Swims animal) {
        waterHabitat.add(animal);
    }

    public void addToAirHabitat(Flies animal) {
        airHabitat.add(animal);
    }

    public void addToLandHabitat(Walks animal) {
        landHabitat.add(animal);
    }

    private void walkersWalk() {
        for (Walks walker : landHabitat) {
            walker.walk();
        }
    }

    private void swimmersSwim() {
        for (Swims swimmer : waterHabitat) {
            swimmer.swim();
        }
    }

    private void fliersFly() {
        for (Flies flier : airHabitat) {
            flier.fly();
        }
    }

    private <E> void printAnimals(List<E> animals) {
        for (E animal : animals) {
            if (animal instanceof Animal) {
                System.out.println(((Animal) animal).name);
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
