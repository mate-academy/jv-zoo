package core.basesyntax.zoo;

import java.util.Collections;

public class App {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Collections.addAll(zoo.allAnimalAviary,
                new Tiger(), new Sparrow(),
                new Penguin(), new Shark());
        for (Animal animal : zoo.allAnimalAviary) {
            if (animal instanceof Bird) {
                zoo.birdAviary.add((Bird) animal);
            } else if (animal instanceof Fish) {
                zoo.aquarium.add((Fish)animal);
            }
        }
        for (Animal animal : zoo.allAnimalAviary) {
            animal.toFeedAnimal(animal);
        }

    }
}
