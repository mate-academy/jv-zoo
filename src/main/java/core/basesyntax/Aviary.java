package core.basesyntax;

import core.basesyntax.interfaces.IFlyable;
import core.basesyntax.interfaces.ISwimmable;
import core.basesyntax.interfaces.IWalkable;
import java.util.ArrayList;
import java.util.List;

public class Aviary<T extends Animal> {
    private final List<T> animalsInAviary;

    public Aviary() {
        this.animalsInAviary = new ArrayList<>();
    }

    public List<T> getAnimalsInAviary() {
        return animalsInAviary;
    }

    public void placeAnimal(T animal) {
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
            if (animal instanceof IFlyable) {
                ((IFlyable) animal).fly();
            }
            if (animal instanceof ISwimmable) {
                ((ISwimmable) animal).swim();
            }
            if (animal instanceof IWalkable) {
                ((IWalkable) animal).walk();
            }
        }
    }
}
