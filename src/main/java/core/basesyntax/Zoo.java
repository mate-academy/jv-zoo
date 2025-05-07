package core.basesyntax;

import core.basesyntax.animals.Animal;
import core.basesyntax.animals.Bird;
import core.basesyntax.animals.Fish;
import core.basesyntax.animals.Mammal;
import core.basesyntax.animals.Penguin;
import core.basesyntax.animals.Shark;
import core.basesyntax.animals.Sparrow;
import core.basesyntax.animals.Tiger;
import core.basesyntax.interfaces.Flyable;
import core.basesyntax.interfaces.Swimmable;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private static final List<Animal> allAnimals = new ArrayList<>();
    Aquarium aquarium = new Aquarium();
    BirdAviary birdAviary = new BirdAviary();
    MammalsAviary mammalsAviary = new MammalsAviary();

    public static List<Animal> getAllAnimals() {
        return allAnimals;
    }

    public static void feedAllAnimals() {
        for (Animal animal : allAnimals) {
            animal.feed();
        }
    }

    public static void moveAnimals() {
        for (Animal animal : allAnimals) {
            if (Bird.class.isAssignableFrom(animal.getClass())) {
                if (Swimmable.class.isAssignableFrom(animal.getClass())) {
                    ((Penguin) animal).swim();
                } else if (Flyable.class.isAssignableFrom(animal.getClass())) {
                    ((Sparrow) animal).fly();
                }
            } else if (Fish.class.isAssignableFrom(animal.getClass())) {
                ((Shark) animal).swim();
            } else if (Mammal.class.isAssignableFrom(animal.getClass())) {
                ((Tiger) animal).move();
            }
        }
    }
}
