package core.basesyntax.zooInhabitantsInstanses;

import core.basesyntax.abstractClasses.Bird;
import core.basesyntax.interfaces.Flyable;

public class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("I'm flying like a sparrow");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow is eating");
    }
}
