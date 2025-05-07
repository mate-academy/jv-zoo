package core.basesyntax.animals;

import core.basesyntax.skills.Swim;

public class Penguin extends Birds implements Swim {
    String name;

    public Penguin(String name) {
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
        System.out.println("Penguin has ate");
    }

    @Override
    public void swimming() {
        System.out.println("Penguin is swimming");
    }
}
