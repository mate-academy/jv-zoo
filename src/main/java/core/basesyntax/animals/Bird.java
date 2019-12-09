package core.basesyntax.animals;

import core.basesyntax.behavior.Flyable;

public abstract class Bird extends Animal implements Flyable {
    @Override
    public void fly(){
        System.out.println("I can fly.");
    }
}
