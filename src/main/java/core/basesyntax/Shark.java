package core.basesyntax;

public class Shark extends Fish implements CanSwim {
    public Shark(String name, String favouriteFood) {
        super("Great white shark", 650, name, favouriteFood, 8);
    }
}
