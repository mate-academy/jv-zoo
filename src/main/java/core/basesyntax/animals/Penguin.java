package core.basesyntax.animals;

import core.basesyntax.interfaces.Swimable;

public class Penguin extends Animal implements Swimable {
    @Override
    public void swim() {
        System.out.println("I'm penguin and I'm swiming");
    }

    @Override
    public void feed() {
        System.out.println("I'm penguin and I like fresh fish");
    }
}
