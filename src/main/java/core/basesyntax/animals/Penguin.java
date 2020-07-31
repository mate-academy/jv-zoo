package core.basesyntax.animals;

import core.basesyntax.animaltype.Bird;
import core.basesyntax.interfaces.Swimable;

public class Penguin extends Bird implements Swimable {
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

    @Override
    public void swim() {

    }
}
