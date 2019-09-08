package core.basesyntax.animals;

import core.basesyntax.interfaces.Flyable;

public class Test implements Flyable {
    @Override
    public void fly() {
        System.out.println("I'm test object");
    }
}
