package core.basesyntax.abilities;

public interface FlyAble {
    default String fly() {
        return "is able to fly";
    }
}
