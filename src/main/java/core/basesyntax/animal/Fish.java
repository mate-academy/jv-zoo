package core.basesyntax.animal;

import core.basesyntax.types.Swimmable;

public abstract class Fish extends Animal implements Swimmable {

    public Fish(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("Look at me I'm swimming");
    }
}
