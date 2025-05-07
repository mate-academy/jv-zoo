package core.basesyntax.animals;

import core.basesyntax.interfaces.Movable;

public class Tiger extends Mammal implements Movable {
    public Tiger(int id) {
        super(id);
    }

    @Override
    public void feed() {
        System.out.println("Tiger " + id + " is feed");
    }

    @Override
    public void move() {
        System.out.println("Tiger " + id + " is moving");
    }
}
