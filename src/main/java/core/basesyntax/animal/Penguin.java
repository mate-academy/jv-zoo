package core.basesyntax.animal;

import core.basesyntax.types.Swimmable;

public class Penguin extends Bird implements Swimmable {

    public Penguin(String name) {
        super(name);
    }

    @Deprecated
    public void fly() {
        System.out.println("I have wings but I cannot fly(");
    }

    @Override
    public void swim() {
        System.out.println("Look at me I'm swimming");
    }
}
