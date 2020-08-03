package core.basesyntax.animals.bird;

import core.basesyntax.animals.Animal;
import core.basesyntax.interfaces.Flying;

public abstract class FlyingBird extends Animal implements Flying {

    @Override
    public String fly() {
        return "flies...";
    }
}
