package core.basesyntax.model;

import core.basesyntax.Bird;
import core.basesyntax.Swimming;

public class Penguin extends Bird implements Swimming {
    @Override
    public void getInfo() {
        System.out.println("Penguin eats" + getFood() + " and live in ");
    }

    @Override
    public void swim() {
    }
}
