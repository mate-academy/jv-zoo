package core.basesyntax.animals;

import core.basesyntax.abstractclasses.AbstractBird;
import core.basesyntax.interfaces.Swims;

public class Penguin extends AbstractBird implements Swims {

    public Penguin() {
        this.name = "Penguin";
    }

    @Override
    public void feed() {
        System.out.println(name + " eats");
    }

    @Override
    public void swim() {
        System.out.println(name + " SWIIIIIIIIIIIIIMS");
    }
}
