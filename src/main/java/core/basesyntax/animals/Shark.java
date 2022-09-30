package core.basesyntax.animals;

import core.basesyntax.interfaces.Swimable;

public class Shark extends Fish implements Swimable {
    public Shark(String name, int age) {
        super(name, age);
    }

    @Override
    public void feed() {
        System.out.println("Shark fed");
    }

    @Override
    public void swim() {
        System.out.println("Shark swim");
    }
}
