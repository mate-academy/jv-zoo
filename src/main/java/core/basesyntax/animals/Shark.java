package core.basesyntax.animals;

import core.basesyntax.interfaces.Swimable;

public class Shark extends Animal implements Swimable {
    @Override
    public void swim() {
        System.out.println("I'm shark and I'm swiming");
    }

    @Override
    public void feed() {
        System.out.println("I'm shark and I like to eat a lot of fish");
    }
}
