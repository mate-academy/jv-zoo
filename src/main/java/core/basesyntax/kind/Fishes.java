package core.basesyntax.kind;

import core.basesyntax.animals.Animal;
import core.basesyntax.properties.Swimable;

public abstract class Fishes extends Animal implements Swimable {
    public Fishes(String name, int age) {
        super(name, age);
    }
}
