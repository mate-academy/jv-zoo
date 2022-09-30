package core.basesyntax.animals;

import core.basesyntax.abstracts.Fish;
import core.basesyntax.interfaces.Swimable;

public class Shark extends Fish implements Swimable {
    public Shark(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("You feed shark");
    }

    @Override
    public void swim() {
        System.out.println("Shark swim");
    }
}