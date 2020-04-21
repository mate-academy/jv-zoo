package core.basesyntax.zoo.task.animals;

import core.basesyntax.zoo.task.animals.interfaces.AbleToEat;

public abstract class Animal implements AbleToEat {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.format("%8s feeded as well! \n", name);
    }

    @Override
    public String toString() {
        return name;
    }
}
