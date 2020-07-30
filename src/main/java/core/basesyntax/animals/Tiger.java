package core.basesyntax.animals;

import core.basesyntax.abstractclasses.Animal;
import core.basesyntax.interfaces.Walks;

public class Tiger extends Animal implements Walks {

    public Tiger() {
        this.name = "Tiger";
    }

    @Override
    public void feed() {
        System.out.println(name + " eats");
    }

    @Override
    public void walk() {
        System.out.println(name + " WAAAAAAAAAAAAAALKS");
    }
}
