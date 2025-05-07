package core.basesyntax.animals;

import core.basesyntax.abstractclasses.Bird;
import core.basesyntax.interfaces.Swimming;

public class Penguin extends Bird implements Swimming {

    public Penguin(String name) {
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
