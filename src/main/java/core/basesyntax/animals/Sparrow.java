package core.basesyntax.animals;

import core.basesyntax.interfaces.Flyable;

public class Sparrow implements Flyable {
    @Override
    public void fly() {
        System.out.println("I'm sparrow and I'm flying");
    }

    @Override
    public void feed() {
        System.out.println("I'm sparrow and I like to eat bread");
    }
}
