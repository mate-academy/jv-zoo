package core.basesyntax;

public interface Flying {
    public default String fly() {
        return "flying";
    }
}
