package core.basesyntax.model;

import core.basesyntax.Mammals;
import core.basesyntax.Running;

public class Tiger extends Mammals implements Running {

    @Override
    public void getInfo() {
        System.out.println("Tiger eats" + getFood() + "and live in ");
    }

    @Override
    public void run() {
    }
}
