package core.basesyntax.cells;

import core.basesyntax.enumerate.AnimalType;
import core.basesyntax.factory.AnimalFactory;
import core.basesyntax.interfaces.Feedable;

import java.util.ArrayList;
import java.util.List;

public class AnimalsHome<T extends Feedable> {
    private List<T> animalsHome = new ArrayList<>();

    public void addAnimal(AnimalType animalType) {
        animalsHome.add(AnimalFactory.animalFactory(animalType));
    }

    public void feedAll() {
        for (T animal : animalsHome) {
            animal.feed();
        }
    }
}
