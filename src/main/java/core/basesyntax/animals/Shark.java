package core.basesyntax.animals;

import core.basesyntax.interfaces.Swimmable;

public class Shark extends Fish implements Swimmable {
    public Shark(int id) {
        super(id);
    }

    @Override
    public void feed() {
        System.out.println("Shark " + id + " is feed");
    }

    @Override
    public void swim() {
        System.out.println("Shark " + id + " is swim");
    }
}
