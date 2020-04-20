package core.basesyntax;

public interface CanSwim {
    default void swim() {
        System.out.println("I am swimming, honey!");
    }
}
