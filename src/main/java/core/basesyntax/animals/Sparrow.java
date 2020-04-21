package core.basesyntax.animals;

import core.basesyntax.abilities.FlyAble;
import core.basesyntax.abstractanimals.Bird;

public class Sparrow extends Bird implements FlyAble {

    public Sparrow(String name, int age) {
        super(name, age);
    }

    @Override
    public void showSpecialAbility() {
        System.out.println(this.getClass().getSimpleName() + " " + super.getName() + " " + fly());
    }
}
