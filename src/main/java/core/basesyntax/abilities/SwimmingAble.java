package core.basesyntax.abilities;

public interface SwimmingAble extends SpecificAbility {
    default String swim() {
        return "is able to swim";
    }
}
