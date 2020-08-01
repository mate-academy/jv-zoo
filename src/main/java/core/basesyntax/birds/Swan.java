package core.basesyntax.birds;

import core.basesyntax.implementation.CanSwim;
import core.basesyntax.implementation.FlyWithWinks;

public class Swan extends Birds {

    public Swan(String name, int age) {
        super(name, age);
        flyBehavior = new FlyWithWinks();
        swimable = new CanSwim();
    }

    @Override
    public void eat() {
        System.out.println(String.format("%s like to eat aquatic plants", getName()));
    }
}
