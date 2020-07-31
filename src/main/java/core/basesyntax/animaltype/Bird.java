package core.basesyntax.animaltype;

import core.basesyntax.interfaces.Flyable;
import core.basesyntax.interfaces.Walkable;

public abstract class Bird extends Animal implements Flyable, Walkable {

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public abstract void fly();

    @Override
    public abstract void walk();
}
