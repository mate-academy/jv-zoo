package core.basesyntax.animals;

import core.basesyntax.abstracts.Animal;
import core.basesyntax.interfaces.Walking;

public class Tiger extends Animal implements Walking {
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("You feed tiger");
    }

    @Override
    public void walk() {
        System.out.println("Tiger walk");
    }
}
