package core.basesyntax.model;

import core.basesyntax.Bird;
import core.basesyntax.Swimming;

public class Penguin extends Bird implements Swimming {
    private String food = "small fish";

    @Override
    public void getInfo() {
        System.out.println("Sparrow eats " + getFood(food) + " can " + swim() + " and live in ");
    }
}
