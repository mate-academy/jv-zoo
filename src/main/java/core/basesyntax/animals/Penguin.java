package core.basesyntax.animals;

import core.basesyntax.behavior.Swimable;

public class Penguin extends Animal implements Swimable {

    @Override
    public void feed() {
        System.out.println("I'm penguin and i eat fish.");
    }

    @Override
    public void swim() {
        System.out.println("I'm penguin and i can swim");
    }
}
