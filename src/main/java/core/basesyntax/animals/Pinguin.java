package core.basesyntax.animals;

import core.basesyntax.interfaces.Swimable;

public class Pinguin extends Bird implements Swimable {
    @Override
    public void feed() {
        System.out.println("Pinguin fed");
    }

    @Override
    public void swim() {
        System.out.println("Pinguin swim");
    }
}
