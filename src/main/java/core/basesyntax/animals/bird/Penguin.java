package core.basesyntax.animals.bird;

import core.basesyntax.interfaces.Swimmable;

public class Penguin extends Bird implements Swimmable {
    @Override
    public void swim() {
        System.out.println("floats...");
    }
}
