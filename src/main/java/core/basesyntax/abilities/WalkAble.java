package core.basesyntax.abilities;

public interface WalkAble {
    default String walk() {
        return "is able to walk";
    }
}
