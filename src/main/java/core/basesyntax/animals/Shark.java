package core.basesyntax.animals;

import core.basesyntax.skills.Swim;

public class Shark extends Fishes implements Swim {

    String name;

    public Shark(String name) {
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
        System.out.println("Shark has ate");
    }

    @Override
    public void swimming() {
        System.out.println("Shark is swimming");
    }
}
