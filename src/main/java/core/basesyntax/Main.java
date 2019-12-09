package core.basesyntax;

import core.basesyntax.zoo.Animal;
import core.basesyntax.zoo.CageType;
import core.basesyntax.zoo.birds.Penguin;
import core.basesyntax.zoo.birds.Sparrow;
import core.basesyntax.zoo.fishes.Shark;
import core.basesyntax.zoo.mammals.Tiger;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Animal, CageType> zoo = new HashMap<>();
        zoo.put(new Shark(), CageType.AQUARIUM);
        zoo.put(new Sparrow(), CageType.CAGE_FOR_BIRDS);
        zoo.put(new Penguin(), CageType.CAGE_FOR_ANIMALS);
        zoo.put(new Tiger(), CageType.CAGE_FOR_ANIMALS);
        Animal.feedAllAnimals();

    }
}
