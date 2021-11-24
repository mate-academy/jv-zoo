package core.basesyntax.animals;

import core.basesyntax.skills.Fly;

public class Sparrow extends Birds implements Fly {
    String name;

    public Sparrow(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Sparrow has ate");
    }

    @Override
    public void flying() {
        System.out.println("Sparrow is flying");
    }
}
