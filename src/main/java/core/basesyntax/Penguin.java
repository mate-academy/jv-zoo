package core.basesyntax;

import core.basesyntax.abilitiesOfAnimals.NonFlyable;
import core.basesyntax.abilitiesOfAnimals.SwimAble;
import core.basesyntax.classificationByType.Bird;

public class Penguin extends Animal implements NonFlyable, Bird, SwimAble {

    public Penguin(String type) {
        super(type);
    }

    @Override
    public void full() {
        System.out.println("Penguin is full");
    }
}
