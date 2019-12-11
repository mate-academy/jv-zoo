package core.basesyntax.animals;

import core.basesyntax.generics.Flyable;

public class Penguin implements Flyable {

    @Override
    public void move() {
        System.out.println("Hi! I'm penguin! I swim!");
    }

    @Override
    public void feed() {
        System.out.println("I eat little fish!");
    }
}

