package core.basesyntax.animals.birds;

import core.basesyntax.animals.interfaces.Swimmable;

public class Penguin extends Bird implements Swimmable {
    String name;

    public Penguin(String name) {
        this.name = name;
    }

    @Override
    public void swimming() {
        System.out.println("Penguin " + name + " is swimming!");
    }

    @Override
    public void layEggs() {
        System.out.println("Penguin " + name + " laid egs!");
    }

    @Override
    public void eat() {
        System.out.println("Penguin " + name + " was fad");
    }
}
