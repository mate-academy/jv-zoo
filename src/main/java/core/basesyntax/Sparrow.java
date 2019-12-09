package core.basesyntax;

public class Sparrow extends Bird implements Flyable {
    String name;

    public Sparrow(String name) {
        this.name = name;
    }

    public Sparrow() {
    }

    @Override
    String feed() {
        String[] feed = {"corn", "seed", "berry"};
        return "Sparrow has feded by " + feed[(int) (Math.random() * feed.length)] + ".";
    }

    @Override
    public String flyable() {
        return "Sparrow can fly.";
    }
}
