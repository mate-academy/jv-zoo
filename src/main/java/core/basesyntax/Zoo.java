package core.basesyntax;

import core.basesyntax.animals.Animal;
import core.basesyntax.enumerate.AnimalType;
import core.basesyntax.factory.AnimalFactory;
import core.basesyntax.interfaces.Flyable;
import core.basesyntax.interfaces.Swimable;

import java.util.ArrayList;
import java.util.List;

public class Zoo<T extends Animal>{
    private List<T> animalsHome = new ArrayList<>();

    public void addAnimal(AnimalType animalType) {
        animalsHome.add(AnimalFactory.animalFactory(animalType));
    }
    public void feedAll() {
        for(T animal : animalsHome) {
            animal.feed();
        }
    }

    private List<T> birdsHome = new ArrayList<>();
    public void addBird(Flyable f) {
        birdsHome.add((T) f);
    }
    public void feedBirds() {
        for(T animal : birdsHome) {
            animal.feed();
        }
    }

    private List<T> fishHome = new ArrayList<>();
    public void addFish(Swimable s) {
        birdsHome.add((T) s);
    }
    public void feedFish() {
        for(T animal : fishHome) {
            animal.feed();
        }
    }

}
