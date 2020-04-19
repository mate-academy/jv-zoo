package core.basesyntax;

import core.basesyntax.models.Animal;
import java.util.ArrayList;
import java.util.List;

public class Area<T extends Animal> {
    List<T> animals;

    public Area() {
        animals = new ArrayList<>();
    }

    public void add(T animal) {
        animals.add(animal);
    }

    public void feedAnimals() {
        animals.forEach(animal -> System.out.println(animal.getTypeOfAnimal() + " was fed!"));
    }
}
