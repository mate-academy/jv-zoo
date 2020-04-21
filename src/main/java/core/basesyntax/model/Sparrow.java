package core.basesyntax.model;

import core.basesyntax.interfaces.Flyable;

public class Sparrow extends Aves implements Flyable {
    public Sparrow(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "I am sparrow ";
    }
}
