package core.basesyntax.animals;

import core.basesyntax.interfaces.Foodable;

public abstract class Animal implements Foodable {

    @Override
    public String eat() {
        return "eats...";
    }

}
