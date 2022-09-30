package core.basesyntax.abstracts;

import core.basesyntax.interfaces.Swimable;

public abstract class Fish extends Animal implements Swimable {

    public Fish(String name, int age) {
        super(name, age);
    }
}
