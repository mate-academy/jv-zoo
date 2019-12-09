package core.basesyntax.animals;

import core.basesyntax.behavior.Swimable;

public abstract class Fish extends Animal implements Swimable {
    @Override
    public void swim(){
        System.out.println("I can swim");
    }
}
