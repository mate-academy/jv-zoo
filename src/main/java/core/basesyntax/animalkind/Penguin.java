package core.basesyntax.animalkind;

import core.basesyntax.animaltype.Bird;
import core.basesyntax.interfaces.ISwimmable;
import core.basesyntax.interfaces.IWalkable;

public class Penguin extends Bird implements ISwimmable, IWalkable {
    private String name;

    public Penguin(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void eat() {
        System.out.println("Penguin: Yummy, yummy fish!");
    }

    @Override
    public void swim() {
        System.out.println("Time for Penguins swim!");
    }

    @Override
    public void walk() {
        System.out.println("Time for Penguins walk!");
    }
}
