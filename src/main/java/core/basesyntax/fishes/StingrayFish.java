package core.basesyntax.fishes;

import core.basesyntax.implementation.CanSwim;
import core.basesyntax.implementation.FlyNoWay;

public class StingrayFish extends Fishes {

    public StingrayFish(String name, int age) {
        super(name, age);
        swimable = new CanSwim();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void eat() {
        System.out.println(String.format("%s like to eat a little fish", getName()));
    }
}
