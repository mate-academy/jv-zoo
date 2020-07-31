package core.basesyntax.animaltype;

import core.basesyntax.interfaces.Walkable;

public abstract class OtherAnimals extends Animal implements Walkable {
    public OtherAnimals(String name, int age) {
        super(name, age);
    }

    @Override
    public abstract void walk();
}
