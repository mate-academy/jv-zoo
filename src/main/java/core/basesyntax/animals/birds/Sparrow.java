package core.basesyntax.animals.birds;

import core.basesyntax.animals.Bird;
import core.basesyntax.animals.interfaces.Flyable;

public class Sparrow extends Bird implements Flyable {
    public Sparrow(String type, int age, long id) {
        super(type, age, id);
    }

    @Override
    public void fly() {
        System.out.println("I am flying sparrow");
    }
}
