package core.basesyntax.animals;

import core.basesyntax.types.Bird;

public class Penguin extends Bird {
    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }
}
