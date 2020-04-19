package core.basesyntax;

import core.basesyntax.abilitiesOfAnimals.Flyable;
import core.basesyntax.abilitiesOfAnimals.SwimAble;
import core.basesyntax.classificationByType.Mammal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Zoo<T extends Animal> {
    private List<Animal> animals;

    public Zoo(List<Animal> animals) {
        this.animals = new ArrayList<>(animals);
    }

    public List<Animal> aviary() {
        return animals.stream().filter(animal -> animal instanceof Flyable).collect(Collectors.toList());
    }

    public List<Animal> aquarium() {
        return animals.stream().filter(animal -> animal instanceof SwimAble).collect(Collectors.toList());
    }

    public List<Animal> enclosure() {
        return animals.stream().filter(animal -> animal instanceof Mammal).collect(Collectors.toList());
    }

    public void feed(List<Animal> animals) {
        animals.forEach(Animal::full);
    }

    public void whoIn(List<Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }
}
