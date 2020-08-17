package core.basesyntax.animals;

import core.basesyntax.kind.Bird;
import core.basesyntax.properties.Flyable;

public class Sparrow extends Bird implements Flyable {
    public Sparrow(String name, int age) {
        super(name, age);
    }

    @Override
    public String fly() {
        return "Sparrow is flying...";
    }
}
