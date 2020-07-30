package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

/**
 * Feel free to remove this class and create your own.
 */
public class Zoo {
    public static void main(String[] args) {

        List<Bird> aviaryForBirds = new ArrayList<>();
        Animal sparrow = new Sparrow();
        aviaryForBirds.add((Bird) sparrow);

        List<WaterAnimals> aquarium = new ArrayList<>();
        Animal shark = new Shark();
        Animal penguin = new Penguin();
        aquarium.add((WaterAnimals) shark);
        aquarium.add((WaterAnimals) penguin);

        List<Animal> animals = new ArrayList<>();
        Animal tiger = new Tiger();
        animals.add(tiger);
        animals.add(sparrow);
        animals.add(penguin);
        animals.add(shark);

        toFeedAnimal(animals);
        animalIsMove(animals);
    }

    public static void toFeedAnimal(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.feed();
        }
    }

    public static void animalIsMove(List<Animal> animals) {
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                ((Flyable) animal).fly();
            }
            if (animal instanceof Swimmable) {
                ((Swimmable) animal).swim();
            }
        }
    }
}
