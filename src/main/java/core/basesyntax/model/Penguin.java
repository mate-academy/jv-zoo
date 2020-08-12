package core.basesyntax.model;

import core.basesyntax.interfaces.Swimmable;

import java.util.List;

public class Penguin extends Aves implements Swimmable {
    List<Penguin> list;

    public Penguin(String name, List<Penguin> list) {
        super(name);
        this.list = list;
    }

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("I like swimming!.....");
    }

    @Override
    public String toString() {
        return "I am penguin   ";
    }
}
