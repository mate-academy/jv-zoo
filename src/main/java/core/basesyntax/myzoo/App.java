package core.basesyntax.myzoo;

import java.util.ArrayList;

/**
 * Feel free to remove this class and create your own.
 */
public class App {
    public static void main(String[] args) {
        ArrayList<Swimmable> aquarium = new ArrayList<>();
        Shark shark1 = new Shark();
        shark1.feed();
        shark1.swim();
        aquarium.add(shark1);

        Penguin penguin1 = new Penguin();
        penguin1.feed();
        penguin1.swim();
        penguin1.fly();
        aquarium.add(penguin1);

        ArrayList<Flyable> aviaryForBirds = new ArrayList<>();
        Sparrow sparrow = new Sparrow();
        sparrow.feed();
        sparrow.fly();
        aviaryForBirds.add(sparrow);

        ArrayList<Animal> aviaryForAllAnimals = new ArrayList<>();
        Tiger tiger = new Tiger();
        tiger.feed();
        aviaryForAllAnimals.add(tiger);
    }
}
