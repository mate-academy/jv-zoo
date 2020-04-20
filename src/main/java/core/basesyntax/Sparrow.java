package core.basesyntax;

public class Sparrow extends Bird implements CanFly {
    public Sparrow(String name, String favouriteFood) {
        super("House sparrow", 0.03, name, favouriteFood, 5);
    }
}
