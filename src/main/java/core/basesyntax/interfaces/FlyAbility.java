package core.basesyntax.interfaces;

public interface FlyAbility {

    default void fly(String animal) {
        System.out.println(animal + " can fly.");
    }
}
