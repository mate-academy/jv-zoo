package core.basesyntax;

import core.basesyntax.abilitiesofanimals.NonFlyable;
import core.basesyntax.abilitiesofanimals.SwimAble;
import core.basesyntax.classificationbytype.Bird;

public class Penguin extends Animal implements NonFlyable, Bird, SwimAble {

    public Penguin(String type) {
        super(type);
    }

    @Override
    public void full() {
        System.out.println("Penguin is full");
    }
}
