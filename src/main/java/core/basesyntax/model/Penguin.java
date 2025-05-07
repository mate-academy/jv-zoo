package core.basesyntax.model;

import core.basesyntax.interfaces.Swimmable;

public class Penguin extends Pisces implements Swimmable {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("I like swimming!.....");
    }
}
