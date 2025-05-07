package core.basesyntax;

public class Shark extends Fish implements Swimmable {
    String name;

    public Shark(String name) {
        this.name = name;
    }

    public Shark() {
    }

    @Override
    String feed() {
        String[] feed = {"meat", "human's part", "fish"};
        return "Shark has feded by " + feed[(int) (Math.random() * feed.length)] + ".";
    }

    @Override
    public String swimmable() {
        return "Shark can swim.";
    }
}
