package core.basesyntax.abilities;

public interface WalkAble extends SpecificAbility {
    default String walk() {
        return "is able to walk";
    }
}
