package core.basesyntax.animals.birds;

import core.basesyntax.animals.fishes.Swimable;

public class Penguin extends Bird implements Swimable {
    @Override
    public void swim() {
        System.out.println("I'm Penguin, I am swimming.");
    }

    @Override
    public void eat() {
        System.out.println("I'm Penguin, I am eating.");
    }
}
