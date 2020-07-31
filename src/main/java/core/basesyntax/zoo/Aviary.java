package core.basesyntax.zoo;

import core.basesyntax.animals.Animal;
import java.util.ArrayList;
import java.util.List;

public class Aviary {

    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void outputListAnimalsInAviary() {
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
        System.out.println();
    }
}
