package core.basesyntax.zoo.task.animals;

import core.basesyntax.zoo.task.animals.interfaces.AbleToMoveOnTheLand;
import core.basesyntax.zoo.task.animals.interfaces.Flyable;
import core.basesyntax.zoo.task.animals.interfaces.Swimable;

public class Penguin extends Animal implements Swimable, AbleToMoveOnTheLand, Flyable {
    public Penguin() {
        super("Penguin");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguin cannot fly");
    }
}
