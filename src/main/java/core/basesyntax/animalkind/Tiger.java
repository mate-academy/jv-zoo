package core.basesyntax.animalkind;

import core.basesyntax.animaltype.Terrestrial;
import core.basesyntax.interfaces.Walkable;

public class Tiger extends Terrestrial implements Walkable {

    public Tiger(String name, int age) {
        super(name, age);
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
