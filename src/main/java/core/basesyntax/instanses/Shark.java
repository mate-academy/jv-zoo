package core.basesyntax.instanses;

import core.basesyntax.abstractclasses.Fish;
import core.basesyntax.interfaces.Swimable;

public class Shark extends Fish implements Swimable {
    @Override
    public void swim() {
        System.out.println("I'm swimming like a shark");
    }

    @Override
    public void eat() {
        System.out.println("Shark is eating");
    }
}
