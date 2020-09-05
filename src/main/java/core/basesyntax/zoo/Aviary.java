package core.basesyntax.zoo;

import core.basesyntax.animals.Animal;
import core.basesyntax.interfaces.Flyable;
import core.basesyntax.interfaces.Swimmable;
import java.util.ArrayList;
import java.util.List;

public class Aviary<T extends Animal> {
    private List<T> animals;

    public Aviary() {
        animals = new ArrayList<>();
    }

    public void addAnimal(T animal) {
        animals.add(animal);
    }

    public void executeAnimalAction() {
        for (T animal : animals) {
            if (animal instanceof Flyable) {
                ((Flyable) animal).fly();
            }
            if (animal instanceof Swimmable) {
                ((Swimmable) animal).swim();
            }
        }
    }

    public void feedAnimals() {
        animals.forEach(Animal::eat);
    }
}
