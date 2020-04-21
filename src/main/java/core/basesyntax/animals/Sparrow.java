package core.basesyntax.animals;

import core.basesyntax.types.Bird;
import core.basesyntax.types.Flyable;

public class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow is eating");
    }
}
