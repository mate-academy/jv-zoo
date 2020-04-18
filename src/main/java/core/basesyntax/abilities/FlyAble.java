package core.basesyntax.abilities;

public interface FlyAble extends SpecificAbility {
    default String fly() {
        return "is able to fly";
    }
}
