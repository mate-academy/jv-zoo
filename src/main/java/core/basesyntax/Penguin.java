package core.basesyntax;

public class Penguin extends Bird implements CanSwim {
    public Penguin(String name, String favouriteFood) {
        super("Emperor penguin", 29, name, favouriteFood, 1);
    }
}
