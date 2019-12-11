package core.basesyntax.animals;

import core.basesyntax.generics.Mammal;

public class Tiger implements Mammal {

    @Override
    public void move() {
        System.out.println("Hi! I'm tiger! I go!");
    }

    @Override
    public void feed() {
        System.out.println("I eat meal!");
    }
}
