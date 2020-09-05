package core.basesyntax.animals.bird;

import core.basesyntax.interfaces.Flyable;

public class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("flying");
    }
}
