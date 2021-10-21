package core.basesyntax.model;

import core.basesyntax.Bird;
import core.basesyntax.Flying;

public class Sparrow extends Bird implements Flying {

    @Override
    public void fly() {
    }

    @Override
    public void getInfo() {
        System.out.println("Sparrow eats" + getFood() + "and live in ");
    }

}
