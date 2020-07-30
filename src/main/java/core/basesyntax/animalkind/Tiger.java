package core.basesyntax.animalkind;

import core.basesyntax.animaltype.Terrestrial;
import core.basesyntax.interfaces.IWalkable;

public class Tiger extends Terrestrial implements IWalkable {
    private String name;

    public Tiger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void eat() {
        System.out.println("Tiger: Very taste meat!");
    }

    @Override
    public void walk() {
        System.out.println("Time for Tigers walk!");
    }
}
