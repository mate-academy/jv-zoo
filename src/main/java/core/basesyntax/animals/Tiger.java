package core.basesyntax.animals;

import core.basesyntax.implementation.CanSwim;
import core.basesyntax.implementation.FlyNoWay;

public class Tiger extends Animals {

    public Tiger(String name, int age) {
        super(name, age);
        swimable = new CanSwim();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void eat() {
        System.out.println(String.format("%s like to eat meat", getName()));
    }
}
