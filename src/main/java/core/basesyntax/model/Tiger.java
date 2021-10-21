package core.basesyntax.model;

import core.basesyntax.Mammals;
import core.basesyntax.Running;

public class Tiger extends Mammals implements Running {
    private String food = "meet";

    @Override
    public void getInfo() {
        System.out.println("Tiger eats " + getFood(food) + " can " + run() + " and live in ");
    }
}
