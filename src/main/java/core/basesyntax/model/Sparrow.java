package core.basesyntax.model;

import core.basesyntax.Bird;
import core.basesyntax.Flying;

public class Sparrow extends Bird implements Flying {
    private String food = "corn";

    @Override
    public void getInfo() {
        System.out.println("Sparrow eats " + getFood(food) + " can " + fly() + " and live in ");
    }

}
