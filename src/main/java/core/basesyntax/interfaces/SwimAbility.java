package core.basesyntax.interfaces;

public interface SwimAbility {

    default void swim(String animal) {
        System.out.println(animal + " can swim.");
    }
}
