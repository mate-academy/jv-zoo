package core.basesyntax.animalkind;

import core.basesyntax.animaltype.Bird;
import core.basesyntax.interfaces.Swimmable;
import core.basesyntax.interfaces.Walkable;

public class Penguin extends Bird implements Swimmable, Walkable {

    public Penguin(String name, int age) {
        super(name, age);
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
