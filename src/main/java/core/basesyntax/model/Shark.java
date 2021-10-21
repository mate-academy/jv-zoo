package core.basesyntax.model;

import core.basesyntax.Fish;
import core.basesyntax.Swimming;

public class Shark extends Fish implements Swimming {
    private String food = "fish";

    @Override
    public void getInfo() {
        System.out.println("Sparrow eats " + getFood(food) + " can " + swim() + " and live in ");
    }
}
