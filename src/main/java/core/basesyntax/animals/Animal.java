package core.basesyntax.animals;

import core.basesyntax.interfaces.Foodable;

public abstract class Animal implements Foodable {
    @Override
    public void eat() {
        System.out.println("eats...");
    }

}
