package core.basesyntax.zoo.task.animals.interfaces;

public interface Swimable {
    default void swim() {
        System.out.println("Swim");
    }
}
