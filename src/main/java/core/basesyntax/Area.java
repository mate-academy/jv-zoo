package core.basesyntax;

import core.basesyntax.models.Animal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Area<T extends Animal> {
    private List<T> animals;

    public Area() {
        animals = new ArrayList<>();
    }

    public void add(T animal) {
        animals.add(animal);
    }

    public void feedAnimals() {
        String feeding = animals.stream()
                .map(Animal::getTypeOfAnimal)
                .collect(Collectors.joining(", "))
                + (animals.size() > 1 ? " were" : " was")
                + " fed.";
        System.out.println(feeding);
    }
}
