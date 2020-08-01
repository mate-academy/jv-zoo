package core.basesyntax.implementation;

import core.basesyntax.interfaces.Swimable;

public class SwimNoWay implements Swimable {
    @Override
    public void swim() {
        System.out.println("I can't swim!");
    }
}
