package core.basesyntax.birds;

import core.basesyntax.implementation.FlyWithWinks;
import core.basesyntax.implementation.SwimNoWay;

public class Eagle extends Birds {

    public Eagle(String name, int age) {
        super(name, age);
        flyBehavior = new FlyWithWinks();
        swimable = new SwimNoWay();
    }

    @Override
    public void eat() {
        System.out.println(String.format("%s like to eat meat, and fish", getName()));
    }
}
