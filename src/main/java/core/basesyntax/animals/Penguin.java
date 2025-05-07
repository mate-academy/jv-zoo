package core.basesyntax.animals;

import core.basesyntax.interfaces.Swimmable;

public class Penguin extends Bird implements Swimmable {
    public Penguin(int id) {
        super(id);
    }

    @Override
    public void feed() {
        System.out.println("Penguin " + id + " is feed");
    }

    @Override
    public void swim() {
        System.out.println("Penguin " + id + " is swimming");
    }
}
