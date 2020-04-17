package core.basesyntax.zoo.task.animals.interfaces;

public interface AbleToMoveOnTheLand {
    default void move() {
        System.out.println("Move through the land");
    }
}
