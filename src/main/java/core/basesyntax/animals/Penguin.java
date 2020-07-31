package core.basesyntax.animals;

import core.basesyntax.animaltype.Bird;
import core.basesyntax.interfaces.Swimable;

public class Penguin extends Bird implements Swimable {

    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println("Unfortunately i can't fly :(");
    }

    @Override
    public void walk() {
        System.out.println("I'm walking funny");
    }

    @Override
    public void swim() {
        System.out.println("I can swim as well\n");
    }
}
