package core.basesyntax;

public class Shark extends Fish implements CanSwim {
    public Shark(String name, String favouriteFood) {
        super("Great white shark", 650, name, favouriteFood, 8);
    }

    @Override
    public void swim() {
        System.out.println("When I start swimming, everyone tries to hide from me...");
    }
}
