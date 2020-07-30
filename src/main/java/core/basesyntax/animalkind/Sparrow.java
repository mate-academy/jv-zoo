package core.basesyntax.animalkind;

import core.basesyntax.animaltype.Bird;
import core.basesyntax.interfaces.IFlyable;

public class Sparrow extends Bird implements IFlyable {
    private String name;

    public Sparrow(String name) {
        this.name = name;
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
