package core.basesyntax.zoo.birds;

import core.basesyntax.implemantations.SwimAble;

public class Penguin extends Birds implements SwimAble {
    @Override
    public void canFly() {
        System.out.println("penguin can't fly");
    }

    @Override
    public void canSwim() {
        System.out.println("penguin can swim");
    }

    @Override
    public String toString() {
        return "Penguin{"
                + "cageType="
                + cageType
                + '}';
    }
}
