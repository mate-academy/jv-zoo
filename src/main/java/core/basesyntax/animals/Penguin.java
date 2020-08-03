package core.basesyntax.animals;

import core.basesyntax.animaltype.Bird;
import core.basesyntax.interfaces.Swimable;
import core.basesyntax.interfaces.Walkable;

public class Penguin extends Bird implements Swimable, Walkable {

    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public void walk() {
        System.out.println("I'm walking funny");
    }

    @Override
    public void swim() {
        System.out.println("I can swim as well\n");
    }
}
