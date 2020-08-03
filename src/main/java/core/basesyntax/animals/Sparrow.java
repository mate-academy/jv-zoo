package core.basesyntax.animals;

import core.basesyntax.animaltype.Bird;
import core.basesyntax.interfaces.Flyable;
import core.basesyntax.interfaces.Walkable;

public class Sparrow extends Bird implements Flyable, Walkable {

    public Sparrow(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println("I'm flying very fast");
    }

    @Override
    public void walk() {
        System.out.println("I can walk as well\n");
    }
}
