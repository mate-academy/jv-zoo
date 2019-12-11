package core.basesyntax.animals;

import core.basesyntax.generics.Fish;

public class Shark implements Fish {

    @Override
    public void move() {
        System.out.println("Hi! I'm shark! I swim!");
    }

    @Override
    public void feed() {
        System.out.println("I eat little fish!");
    }
}

