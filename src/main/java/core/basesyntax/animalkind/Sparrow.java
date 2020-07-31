package core.basesyntax.animalkind;

import core.basesyntax.animaltype.Bird;
import core.basesyntax.interfaces.Flyable;

public class Sparrow extends Bird implements Flyable {

    public Sparrow(String name, int age) {
        super(name, age);
    }

    public String getName() {
        return name;
    }

    @Override
    public void eat() {
        System.out.println("Sparrow: Very taste seed!");
    }

    @Override
    public void fly() {
        System.out.println("Time for Sparrows to fly!");
    }
}
