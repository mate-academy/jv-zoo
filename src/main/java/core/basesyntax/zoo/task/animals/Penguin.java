package core.basesyntax.zoo.task.animals;

import core.basesyntax.zoo.task.animals.interfaces.AbleToMoveOnTheLand;
import core.basesyntax.zoo.task.animals.interfaces.Swimable;

public class Penguin extends Animal implements Swimable, AbleToMoveOnTheLand {
    public Penguin() {
        super("Penguin");
    }
}
