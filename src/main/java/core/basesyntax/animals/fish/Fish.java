package core.basesyntax.animals.fish;

import core.basesyntax.animals.Animal;
import core.basesyntax.interfaces.Swimmable;

public abstract class Fish extends Animal implements Swimmable {
    @Override
    public void swim() {
        System.out.println("floats...");
    }
}
