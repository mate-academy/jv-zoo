package core.basesyntax.model;

import core.basesyntax.impl.Aves;
import core.basesyntax.interfaces.Swimmable;

public class Penguin extends Aves implements Swimmable {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("I like swimming!.....");
    }

    @Override
    public void fly() {
        System.out.println("I like flying!.....");
    }
}
