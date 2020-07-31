package core.basesyntax.animaltype;

import core.basesyntax.interfaces.Swimable;

public abstract class Fish extends Animal implements Swimable {

    public Fish(String name, int age) {
        super(name, age, isFed);
    }

    @Override
    public abstract void swim();
}
