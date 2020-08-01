package core.basesyntax.birds;

import core.basesyntax.implementation.CanSwim;
import core.basesyntax.implementation.FlyNoWay;

public class Penguin extends Birds {

    public Penguin(String name, int age) {
        super(name, age);
        flyBehavior = new FlyNoWay();
        swimable = new CanSwim();
    }

    @Override
    public void eat() {
        System.out.println(String.format("%s like to eat fish", getName()));
    }
}
