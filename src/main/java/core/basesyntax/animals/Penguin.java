package core.basesyntax.animals;

import core.basesyntax.types.Bird;
import core.basesyntax.types.Swimmable;

public class Penguin extends Bird implements Swimmable {
    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }
}
