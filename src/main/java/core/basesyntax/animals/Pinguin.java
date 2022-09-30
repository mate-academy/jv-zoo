package core.basesyntax.animals;

import core.basesyntax.abstracts.Bird;
import core.basesyntax.interfaces.Swimable;

public class Pinguin extends Bird implements Swimable {
    public Pinguin(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("You feed pinguin");
    }

    @Override
    public void swim() {
        System.out.println("Pinguin swim");
    }
}