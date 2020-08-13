package core.basesyntax.animals;

import core.basesyntax.kind.Birds;
import core.basesyntax.properties.Swimable;

public class Penguin extends Birds implements Swimable {

    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public String swim() {
        return "Penguin is swimming...";
    }
}
