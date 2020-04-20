package core.basesyntax.controller;

import core.basesyntax.interfaces.Swimmable;

import java.util.List;

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
