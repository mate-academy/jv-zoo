package core.basesyntax.animals;

import core.basesyntax.abstractclasses.AbstractBird;
import core.basesyntax.interfaces.Flies;

public class Sparrow extends AbstractBird implements Flies {

    public Sparrow() {
        this.name = "Sparrow";
    }

    @Override
    public void feed() {
        System.out.println(name + " eats");
    }

    @Override
    public void fly() {
        System.out.println(name + " FLIIIIIIIES");
    }
}
