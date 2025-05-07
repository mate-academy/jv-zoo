package core.basesyntax.zoo.task.animals.interfaces;

public interface Flyable {
    default void fly() {
        System.out.println("Fly in the air");
    }
}
