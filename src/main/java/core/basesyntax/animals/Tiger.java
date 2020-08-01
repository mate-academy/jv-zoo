package core.basesyntax.animals;

import core.basesyntax.abstractclasses.Animal;
import core.basesyntax.interfaces.Walking;

public class Tiger extends Animal implements Walking {

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println(this.getName() + " eats");
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + " WAAAAAAAAAAAAAALKS");
    }
}
