package core.basesyntax;

public interface CanFly {
    default void fly() {
        System.out.println("I am flying and you can't!");
    }
}
