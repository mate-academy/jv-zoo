package core.basesyntax.abilities;

public interface SwimmingAble {
    default String swim() {
        return "is able to swim";
    }
}
