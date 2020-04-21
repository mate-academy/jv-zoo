package core.basesyntax.animals;

import core.basesyntax.abilities.WalkAndSwimmingAble;
import core.basesyntax.abstractanimals.Bird;

public class Penguin extends Bird implements WalkAndSwimmingAble {
    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public void showSpecialAbility() {
        System.out.println(this.getClass().getSimpleName() + " "
                + super.getName()
                + " " + swim()
                + " " + walk());
    }
}
