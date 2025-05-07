package core.basesyntax.zoo.task.animals;

import core.basesyntax.zoo.task.animals.interfaces.AbleToMoveOnTheLand;
import core.basesyntax.zoo.task.animals.interfaces.Flyable;

public class Sparrow extends Animal implements Flyable, AbleToMoveOnTheLand {
    public Sparrow() {
        super("Sparrow");
    }
}
