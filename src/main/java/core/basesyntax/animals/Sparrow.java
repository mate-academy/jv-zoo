package core.basesyntax.animals;

import core.basesyntax.abstractclasses.Bird;
import core.basesyntax.interfaces.Flying;

public class Sparrow extends Bird implements Flying {

    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println(this.getName() + " eats");
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " FLIIIIIIIES");
    }
}
