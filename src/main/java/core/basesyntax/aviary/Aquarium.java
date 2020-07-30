package core.basesyntax.aviary;

import core.basesyntax.abstracts.Animal;
import core.basesyntax.abstracts.Aviary;

public class Aquarium extends Aviary<Animal> {

    public Aquarium(Animal animal) {
        super(animal);
    }

}
