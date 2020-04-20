package core.basesyntax.impl;

import core.basesyntax.model.Animal;
import core.basesyntax.interfaces.Swimmable;
//Pisces(Latin) is a class of fish
public class Pisces extends Animal implements Swimmable {
    public Pisces(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("I like swimming!.....");
    }
}
