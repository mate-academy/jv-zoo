package core.basesyntax.animals;

import core.basesyntax.interfaces.Feedable;

public class Tiger implements Feedable {
    @Override
    public void feed() {
        System.out.println("I'm tiger and I like to eat meat!");
    }
}