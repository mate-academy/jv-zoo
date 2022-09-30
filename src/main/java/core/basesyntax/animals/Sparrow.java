package core.basesyntax.animals;

import core.basesyntax.interfaces.Flyable;

public class Sparrow extends Bird implements Flyable {
    public Sparrow(int id) {
        super(id);
    }

    @Override
    public void feed() {
        System.out.println("Bird " + id + " is feed");
    }

    @Override
    public void fly() {
        System.out.println("Bird " + id + " is flying");
    }
}
