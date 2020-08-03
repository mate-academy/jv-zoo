package core.basesyntax.fishes;

import core.basesyntax.ResidentsOfTheZoo;
import core.basesyntax.interfaces.Swimable;

public abstract class Fish extends ResidentsOfTheZoo implements Swimable {

    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("I can swim!");
    }
}
