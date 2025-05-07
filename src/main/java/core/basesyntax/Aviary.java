package core.basesyntax;

import core.basesyntax.interfaces.Flyable;
import core.basesyntax.interfaces.Swimmable;
import core.basesyntax.interfaces.Walkable;
import java.util.ArrayList;
import java.util.List;

public class Aviary<T extends Animal> {
    private final List<T> animalsInAviary;

    public Aviary() {
        this.animalsInAviary = new ArrayList<>();
    }

    public List<T> getAnimals() {
        return animalsInAviary;
    }

    public void addAnimal(T animal) {
        animalsInAviary.add(animal);
    }

    public void removeAllAnimals() {
        animalsInAviary.clear();
        System.out.println("Aviary is empty now!");
    }

    public void feedAllInAviary() {
        for (T animal : animalsInAviary) {
            animal.eat();
        }
    }

    public void bringAnimalsActivity() {
        for (T animal : animalsInAviary) {
            if (animal instanceof Flyable) {
                ((Flyable) animal).fly();
            }
            if (animal instanceof Swimmable) {
                ((Swimmable) animal).swim();
            }
            if (animal instanceof Walkable) {
                ((Walkable) animal).walk();
            }
        }
    }
}
