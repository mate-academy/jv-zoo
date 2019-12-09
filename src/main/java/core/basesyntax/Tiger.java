package core.basesyntax;

import org.w3c.dom.ls.LSOutput;

public class Tiger extends Mammal implements Runnable {
    String name;

    public Tiger(String name) {
        this.name = name;
    }

    public Tiger() {
    }

    @Override
    String feed() {
        String[] feed = {"meat", "beef", "steak", "chicken"};
        return "Tiger has been feded by " + feed[(int) (Math.random() * feed.length)] + ".";
    }

    @Override
    public String runnable() {
        return "Tigers can run.";
    }

}
