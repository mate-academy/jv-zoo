package core.basesyntax.animal;

import core.basesyntax.types.Flyable;

public abstract class Bird extends Animal implements Flyable {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I believe I can fly!...");
    }
}
