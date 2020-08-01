package core.basesyntax.animals;

import core.basesyntax.abstractclasses.Fish;
import core.basesyntax.interfaces.Swimming;

public class Shark extends Fish implements Swimming {

    public Shark(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println(this.getName() + " eats");
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + " SWIIIIIIIIIIIIIMS");
    }
}
