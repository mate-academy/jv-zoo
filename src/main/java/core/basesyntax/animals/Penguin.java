package core.basesyntax.animals;

import core.basesyntax.animaltype.Bird;

public class Penguin extends Bird {
    private boolean isFed = false;

    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println("I believe I can fly");
    }

    @Override
    public void walk() {
        System.out.println("I'm walking funny\n");
    }
}
