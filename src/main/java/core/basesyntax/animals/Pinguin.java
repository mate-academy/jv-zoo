package core.basesyntax.animals;

import core.basesyntax.interfaces.Swimable;

public class Pinguin extends Bird implements Swimable {
    public Pinguin(String name, int age) {
        super(name, age);
    }

    @Override
    public void feed() {
        System.out.println("Pinguin fed");
    }

    @Override
    public void swim() {
        System.out.println("Pinguin swim");
    }
}
