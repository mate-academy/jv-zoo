package core.basesyntax.animals;

import core.basesyntax.interfaces.Feedable;

public abstract class Animal implements Feedable {
    int id;

    Animal(int id) {
        this.id = id;
    }
}
