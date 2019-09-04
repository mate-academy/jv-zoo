package core.basesyntax.instanses;

import core.basesyntax.abstractclasses.Bird;
import core.basesyntax.interfaces.Swimable;

public class Penguin extends Bird implements Swimable {
    @Override
    public void swim() {
        System.out.println("I'm swimming like a penguin");
    }

    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }
}
