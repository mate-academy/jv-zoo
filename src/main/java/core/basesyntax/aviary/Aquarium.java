package core.basesyntax.aviary;

import core.basesyntax.abstracts.Animal;
import core.basesyntax.abstracts.Aviary;
import core.basesyntax.interfaces.Swimable;

public class Aquarium<T extends Animal & Swimable> extends Aviary<T> {

    public Aquarium(T animal) {
        super(animal);
    }

}
