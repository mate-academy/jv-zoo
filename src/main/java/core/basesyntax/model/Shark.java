package core.basesyntax.model;

import core.basesyntax.interfaces.Swimmable;

public class Shark extends Pisces implements Swimmable {

    public Shark(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "I am shark ";
    }
}

