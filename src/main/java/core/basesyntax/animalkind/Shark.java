package core.basesyntax.animalkind;

import core.basesyntax.animaltype.Fish;
import core.basesyntax.interfaces.Swimmable;

public class Shark extends Fish implements Swimmable {

    public Shark(String name, int age) {
        super(name, age);
    }

    public String getName() {
        return name;
    }

    @Override
    public void eat() {
        System.out.println("Shark: Very taste meat!");
    }

    @Override
    public void swim() {
        System.out.println("Time for Sharks swim!");
    }
}
