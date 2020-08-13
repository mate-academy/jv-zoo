package core.basesyntax.animals;

import core.basesyntax.kind.Fishes;

public class Shark extends Fishes {
    public Shark(String name, int age) {
        super(name, age);
    }

    @Override
    public String swim() {
        return "Shark is sweaming...";
    }
}
