package core.basesyntax.model;

import core.basesyntax.Fish;
import core.basesyntax.Swimming;

public class Shark extends Fish implements Swimming {

    @Override
    public void getInfo() {
        System.out.println("Shark eats" + getFood() + " and live in ");
    }

    @Override
    public void swim() {

    }
}
