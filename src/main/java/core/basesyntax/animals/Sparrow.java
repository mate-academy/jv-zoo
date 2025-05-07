package core.basesyntax.animals;

import core.basesyntax.generics.Flyable;

public class Sparrow implements Flyable {

    @Override
    public void move() {
        System.out.println("Hi! I'm sparrow! I fly!");
    }

    @Override
    public void feed() {
        System.out.println("I eat insects!");
    }
}
