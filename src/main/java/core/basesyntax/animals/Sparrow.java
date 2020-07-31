package core.basesyntax.animals;

import core.basesyntax.interfaces.Flyable;

public class Sparrow extends Bird implements Flyable {
    public Sparrow(String name, int age) {
        super(name, age);
    }

    @Override
    public void feed() {
        System.out.println("Sparrow fed");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow fly");
    }
}
