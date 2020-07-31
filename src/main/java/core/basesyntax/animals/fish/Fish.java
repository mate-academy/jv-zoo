package core.basesyntax.animals.fish;

import core.basesyntax.animals.Animal;
import core.basesyntax.interfaces.Swimming;

public abstract class Fish extends Animal implements Swimming {

    @Override
    public String swim() {
        return "floats...";
    }
}
