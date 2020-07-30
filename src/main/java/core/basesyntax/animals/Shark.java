package core.basesyntax.animals;

import core.basesyntax.abstractclasses.Animal;
import core.basesyntax.interfaces.Swims;

public class Shark extends Animal implements Swims {

    public Shark() {
        this.name = "Shark";
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
