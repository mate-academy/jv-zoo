package core.basesyntax.animals.bird;

import core.basesyntax.animals.Animal;
import core.basesyntax.interfaces.Swimming;

public abstract class FloatingBird extends Animal implements Swimming {

    @Override
    public String swim() {
        return "floats...";
    }
}
