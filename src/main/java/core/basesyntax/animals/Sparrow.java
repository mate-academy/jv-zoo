package core.basesyntax.animals;

import core.basesyntax.abstracts.Bird;
import core.basesyntax.interfaces.Flyable;

public class Sparrow extends Bird implements Flyable {
    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("You feed Sparrow");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow fly");
    }
}
