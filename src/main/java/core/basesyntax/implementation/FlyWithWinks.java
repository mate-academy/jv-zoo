package core.basesyntax.implementation;

import core.basesyntax.interfaces.FlyBehavior;

public class FlyWithWinks implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying!!!");
    }
}
