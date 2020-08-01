package core.basesyntax.implementation;

import core.basesyntax.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly in my dreams only!!!");
    }
}
