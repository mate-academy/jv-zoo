package core.basesyntax.model;

import core.basesyntax.interfaces.Flyable;

public class Penguin extends Aves implements Flyable {

    public Penguin(String name) {
        super(name);
    }

    public void swim() {
        System.out.println("I like swimming!.....");
    }

    @Override
    public String toString() {
        return "I am penguin   ";
    }
}
