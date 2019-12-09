package core.basesyntax;

public class Pinguin extends Bird implements Swimmable, Flyable {
    String name;

    public Pinguin(String name) {
        this.name = name;
    }

    public Pinguin() {
    }

    public String getName() {
        return name;
    }

    @Override
    public String swimmable() {
        return "Pinguins can swim.";
    }

    @Override
    public String flyable() {
        return "Pingins can't fly but " + swimmable();
    }

    @Override
    String feed() {
        String[] feed = {"fish"};
        return "Pinguin has been feded by " + feed[(int) Math.random() * feed.length] + ".";
    }
}
